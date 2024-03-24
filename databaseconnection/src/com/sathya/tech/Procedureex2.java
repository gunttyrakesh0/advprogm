package com.sathya.tech;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Procedureex2 {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","rakesh","rakesh");
		CallableStatement callablestatement=connection.prepareCall("{call getsal(?,?,?,?)}");
		callablestatement.setInt(1, 1001 );
		callablestatement.registerOutParameter(2, Types.INTEGER);
		callablestatement.registerOutParameter(3, Types.FLOAT);
		callablestatement.registerOutParameter(4, Types.VARCHAR);
		callablestatement.executeUpdate();
		System.out.println(callablestatement.getInt(2)+" "+callablestatement.getString(4)+" "+callablestatement.getFloat(3));
		connection.close();
	}

}
