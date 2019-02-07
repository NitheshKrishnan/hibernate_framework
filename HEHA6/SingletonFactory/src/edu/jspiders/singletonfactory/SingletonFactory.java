package edu.jspiders.singletonfactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingletonFactory {

	private SingletonFactory(){
		
	}
	
	private static SessionFactory factory;
	
	static
	{
		Configuration config = new Configuration().configure();
		
		factory = config.buildSessionFactory();
	}
	
	public static SessionFactory getFactory()
	{
		return factory;
	}
}
