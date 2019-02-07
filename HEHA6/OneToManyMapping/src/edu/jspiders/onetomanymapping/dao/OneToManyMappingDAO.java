package edu.jspiders.onetomanymapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.jspiders.onetomanymapping.dto.SubjectDTO;
import edu.jspiders.onetomanymapping.dto.TrainerProfessionalDTO;
import edu.jspiders.singletonfactory.SingletonFactory;

public class OneToManyMappingDAO {

	public void insert(int empId)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		TrainerProfessionalDTO trainer = session.get(TrainerProfessionalDTO.class, empId);
		
		if(trainer != null)
		{
			SubjectDTO subject1 = new SubjectDTO("HEJM16", "J2ee");
			SubjectDTO subject2 = new SubjectDTO("HEGM6", "Programming");
			SubjectDTO subject3 = new SubjectDTO("HPYM4", "Python");
			SubjectDTO subject4 = new SubjectDTO("HEHA6", "Hibernate Framework");
			
			trainer.addSubjects(subject1);
			trainer.addSubjects(subject2);
			trainer.addSubjects(subject3);
			trainer.addSubjects(subject4);
			
			session.save(subject1);
			session.save(subject2);
			session.save(subject3);
			session.save(subject4);
			
			
			Transaction tx = session.beginTransaction();
			
			tx.commit();
			
		}
		else
		{
			System.out.println("Wrong Trainer Selection");
		}
	}
}
