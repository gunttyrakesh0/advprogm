package com.sathya.tech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dbconnection {
	//This method create the connection &return connection
	public static Connection createConnection() {
		Connection connection=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rakesh","rakesh");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			 e.printStackTrace();
		}
		return connection;
	}

}
