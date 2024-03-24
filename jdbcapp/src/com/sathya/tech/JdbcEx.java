package com.sathya.tech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded sucessfully");
		
		//step 2 create the connection
		Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","rakesh","rakesh");
		System.out.println("connection loaded sucessfully");
		
		//process the query
		
		//close the resources
		connection.close();
		System.out.println("connection closed sucessfully");
	}

}
