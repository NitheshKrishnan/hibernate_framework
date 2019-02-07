package edu.jspiders.hibernatecrud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspiders.hibernatecrud.dto.StudentDTO;
import edu.jspiders.singletonfactory.SingletonFactory;

public class StudentDAO {

	public void save(StudentDTO student)
	{	
		
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		int id = (int) session.save(student);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		System.out.println("Id number = "+id);
		
		session.close();
		
		factory.close();
	}
	
	public StudentDTO select(int id)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		StudentDTO student = session.get(StudentDTO.class, id);
		
		session.close();
		
		return student;
	}
	
	public boolean update(int id)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		StudentDTO student = session.get(StudentDTO.class, id);
		
		if(student!= null)
		{
			student.setMarks(80.5);
			
			session.update(student);
			
			Transaction tx = session.beginTransaction();
			
			tx.commit();
			
			return true;
		}
		
		return false;
	}
	
	public boolean delete(int id)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		StudentDTO student = session.get(StudentDTO.class, id);
		
		if(student!= null)
		{
			
			session.delete(student);
			
			Transaction tx = session.beginTransaction();
			
			tx.commit();
			
			return true;
		}
		
		return false;
	}
}
