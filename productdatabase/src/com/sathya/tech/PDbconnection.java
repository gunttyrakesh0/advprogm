package com.sathya.tech;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class PDbconnection {
	
	public static Connection CreateConnection(){
	Connection connection=null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	connection=DriverManager.getConnection("jdbc:oracl:thin:@localhost:1521:xe","rakesh","rakesh");
	}
	catch(ClassNotFoundException|SQLException e) {
		e.printStackTrace();
	}
	return connection;
	}
 

}
