package edu.jspiders.onetomanymapping.util;

import edu.jspiders.onetomanymapping.dao.OneToManyMappingDAO;

public class OneToManyMappingUtil {

	public static void main(String[] args) {
		
		OneToManyMappingDAO dao = new OneToManyMappingDAO();
		
		dao.insert(2);
	}
}
