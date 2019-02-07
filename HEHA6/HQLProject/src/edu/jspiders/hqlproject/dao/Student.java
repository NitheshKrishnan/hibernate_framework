package edu.jspiders.hqlproject.dao;

public class Student implements Comparable
{
	int id;
	String name;
	double marks;
	
	public Student(int id, String name,double marks) 
	{
		
		this.id = id;
		this.name = name;
		this.marks=marks;
	}
	
	@Override
	public String toString() 
	{
	return this.id+" "+this.name+" "+this.marks;
	}

	@Override
	public int compareTo(Object o) 
	{
		Student s1=(Student)o;
		return s1.id-this.id;
		
	}
	
	
	
	
}
