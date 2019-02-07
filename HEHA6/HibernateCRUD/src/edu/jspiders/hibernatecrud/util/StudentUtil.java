package edu.jspiders.hibernatecrud.util;

import edu.jspiders.hibernatecrud.dao.StudentDAO;
import edu.jspiders.hibernatecrud.dto.StudentDTO;

public class StudentUtil {

	public static void main(String[] args) {
		
		StudentDTO student = new StudentDTO();
		
		student.setFirstName("Batista");
		student.setMiddleName("N/A");
		student.setLastName("N/A");
		student.setMarks(82.5);
		
		StudentDAO dao = new StudentDAO();
		
		dao.save(student);
	
		/*StudentDTO student = dao.select(1);
		
		System.out.println("Id = "+student.getId());
		System.out.println("First name = "+student.getFirstName());
		System.out.println("Middle Name = "+student.getMiddleName());
		System.out.println("last Name = "+student.getLastName());
		System.out.println("Marks = "+student.getMarks());*/
		
		//System.out.println("Are the Changes Made ? "+dao.update(2));
		
		//System.out.println("is the Object Deleted ? "+dao.delete(100));
	}
}
