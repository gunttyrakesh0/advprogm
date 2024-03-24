package com.sathya.tech;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDao {
	public int save(Employee emp) throws SQLException 
	{
		//declare the resources
		Connection connection=null;
		PreparedStatement PreparedStatement=null;
		int count=0;
		try {
			 //get the connection
			connection=Dbconnection.createConnection();
			//create preparedstatement object
			PreparedStatement=connection.prepareStatement("insert into emp1 values(?,?,?)");
			
			//Read the data from emp object and set to parameters
			
			PreparedStatement.setInt(1,emp.getEmpId());
			PreparedStatement.setString(2, emp.getEmpName());
			PreparedStatement.setDouble(3, emp.getEmpsalary());
			count=PreparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
				connection.close();
			if(PreparedStatement!=null)
				PreparedStatement.close();
		}
		return count;
	}
	
		
		
	public Employee findbyId(int empId) {
			 Employee employee=null;
			try(Connection connection=Dbconnection.createConnection();
					PreparedStatement PreparedStatement=connection.prepareStatement("select * from emp1 where empId=?"))
			{
				PreparedStatement.setInt(1,empId);
				ResultSet resultSet=PreparedStatement.executeQuery();
				if(resultSet.next()) {
					employee=new Employee();
					employee.setEmpId(resultSet.getInt(1));
					employee.setEmpName(resultSet.getString(2));
					employee.setEmpsalary(resultSet.getDouble(3));
			}	
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return employee;
			}
			
			
			/*public int deletebyId(int empId) {
				  int count=0;
				try(Connection connection=Dbconnection.createConnection();
						PreparedStatement PreparedStatement=connection.prepareStatement("delete from emp1 where empId=?"))
				{
					PreparedStatement.setInt(1,empId);
					count=PreparedStatement.executeUpdate();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				return count;
			
			}*/
				
				public int deletebysalary(int empsalary) {
					  int deletecount=0;
					try(Connection connection=Dbconnection.createConnection();
							PreparedStatement PreparedStatement=connection.prepareStatement("delete from emp1 where empsalary>?"))
					{
						PreparedStatement.setInt(1,empsalary);
						deletecount=PreparedStatement.executeUpdate();
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
					return deletecount;
			
		}
				
				public List<Employee> findAll(){
					List<Employee> emp=new ArrayList<Employee>();
					try(Connection connection=Dbconnection.createConnection();
						Statement statement=connection.createStatement()){
						ResultSet resultset=statement.executeQuery("select * from emp1");
						while(resultset.next()) {
						Employee employee=new Employee();
						employee.setEmpId(resultset.getInt(1));
						employee.setEmpName(resultset.getString(2));
						employee.setEmpsalary(resultset.getDouble(3));
						emp.add(employee);
						
						}
						
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					return emp;
				}
					
					
					public int UpdateSalary(double currentsalary,double incsalary) {
						int update=0;
					try(Connection connection=Dbconnection.createConnection();
							PreparedStatement PreparedStatement=connection.prepareStatement("UPDATE emp1 set empsalary=empsalary+? where empsalary>?"))
					{
						 
						PreparedStatement.setDouble(1,incsalary);
						PreparedStatement.setDouble(2,currentsalary);
						update=PreparedStatement.executeUpdate();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					return update;
						 
				}
}

	 


