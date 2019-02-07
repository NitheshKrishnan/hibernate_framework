package edu.jspiders.hqlproject.util;

import edu.jspiders.hqlproject.dao.StudentDAO;

public class StudentUtil {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		
		//dao.selectAll();
		
		//dao.selectAllOrderByFirstName();
		
		//dao.updateStudentMarksByMarks();
		
		dao.selectAllByMarks(79.0);
	}
}
