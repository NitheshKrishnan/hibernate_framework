package edu.jspiders.hibernatecrud.dto;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyOwnGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) 
			throws HibernateException {
		
		// jdbc Logic to find Max Value of Id
		
		int count = 2;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/heha6_db?"
					+ "user=root&password=root");
			
			Statement stmt = con.createStatement();
			
			String query = "select max(id) from student_info";
			
			ResultSet rs = stmt.executeQuery(query);
			
			if(rs.next())
			{
				count = rs.getInt(1);
				
				return count + 2;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

}
