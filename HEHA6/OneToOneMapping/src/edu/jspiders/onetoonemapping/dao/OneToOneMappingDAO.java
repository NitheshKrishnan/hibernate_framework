package edu.jspiders.onetoonemapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.jspiders.onetoonemapping.dto.TrainerPersonalDTO;
import edu.jspiders.onetoonemapping.dto.TrainerProfessionalDTO;
import edu.jspiders.singletonfactory.SingletonFactory;

public class OneToOneMappingDAO {

	public void insert(TrainerProfessionalDTO trainer,TrainerPersonalDTO personal)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx  = session.beginTransaction();
		
		trainer.setPersonal(personal);
		
		session.save(trainer);
		
		tx.commit();
		
		session.close();
	}
}
