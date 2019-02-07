package edu.jspiders.manytoonemapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.jspiders.manytoonemapping.dto.FeedbackDTO;
import edu.jspiders.manytoonemapping.dto.SubjectDTO;
import edu.jspiders.singletonfactory.SingletonFactory;

public class ManyToOneMappingDAO {

	public void insert(String batchCode)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		SubjectDTO subject = session.get(SubjectDTO.class, batchCode);
		
		if(subject!=null)
		{
			FeedbackDTO feedback1 = new FeedbackDTO("Excellent Learning done...");
			FeedbackDTO feedback2 = new FeedbackDTO("Good But need More example...");
			FeedbackDTO feedback3 = new FeedbackDTO("Less Practical Aspects but teaching good...");
			
			subject.addFeeback(feedback1);
			subject.addFeeback(feedback2);
			subject.addFeeback(feedback3);
			
			session.save(feedback1);
			session.save(feedback2);
			session.save(feedback3);
			
			session.beginTransaction().commit();
			
		}
		else
		{
			System.out.println("Subject Not Found");
		}
		session.close();
	}
}
