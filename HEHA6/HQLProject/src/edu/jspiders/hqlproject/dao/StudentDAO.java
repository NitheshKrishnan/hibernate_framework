package edu.jspiders.hqlproject.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.jspiders.hqlproject.dto.StudentDTO;
import edu.jspiders.singletonfactory.SingletonFactory;

public class StudentDAO {

	public void selectAll()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM StudentDTO";
		
		Query query = session.createQuery(hql);
		
		List<StudentDTO> list = query.list();
		
		for(StudentDTO student : list)
		{
			System.out.println(student);
			System.out.println("----------------------------------------------------");
		}
		
		session.close();
	}
	
	public void selectAllOrderByFirstName()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM StudentDTO ORDER BY firstName";
		
		Query query = session.createQuery(hql);
		
		List<StudentDTO> list = query.list();
		
		for(StudentDTO student : list)
		{
			System.out.println(student);
			System.out.println("----------------------------------------------------");
		}
		
		session.close();
	}
	
	public void updateStudentMarksByMarks()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "UPDATE StudentDTO set marks = 80 where marks > 90";
		
		Query query = session.createQuery(hql);
		
		int count = query.executeUpdate();
		
		System.out.println("Query OK, "+count+" no. of Rows Affected");
		
		session.close();
	}
	
	
	public void selectAllByMarks(double marks)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM StudentDTO where marks > :value";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("value", marks);
		
		List<StudentDTO> list = query.list();
		
		for(StudentDTO student : list)
		{
			System.out.println(student);
			System.out.println("----------------------------------------------------");
		}
		
		session.close();
	}
}
