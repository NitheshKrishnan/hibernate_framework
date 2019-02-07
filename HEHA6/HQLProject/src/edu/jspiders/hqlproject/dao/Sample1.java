package edu.jspiders.hqlproject.dao;

import java.util.TreeSet;

public class Sample1 
{
public static void main(String[] args) 
{
	TreeSet t=new TreeSet();
	
	
	t.add(12);
	t.add(23);
	t.add(43);
	t.add(122);
	t.add(32);
	t.add(44);
	t.add(2);
	
	
	System.out.println(t);
	System.out.println(t.first());//2
	System.out.println(t.last());//122
	System.out.println(t.headSet(43));//
	System.out.println(t.tailSet(43));
	System.out.println(t.subSet(23, 44));
}
}
