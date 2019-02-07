package edu.jspiders.manytoonemapping.util;

import edu.jspiders.manytoonemapping.dao.ManyToOneMappingDAO;

public class ManyToOneMappingUtil {

	public static void main(String[] args) {
		
		ManyToOneMappingDAO dao = new ManyToOneMappingDAO();
		
		dao.insert("HEGM6");
	}
}