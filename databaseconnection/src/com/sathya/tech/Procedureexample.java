package com.sathya.tech;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Procedureexample {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","rakesh","rakesh");
		CallableStatement callablestatement=connection.prepareCall("{call getsal(?,?)}");
		callablestatement.setInt(1, 1001 );
		callablestatement.registerOutParameter(2, Types.FLOAT);
		callablestatement.executeUpdate();
		System.out.println(callablestatement.getFloat(2));
		connection.close();
	}

}
