package com.sathya.tech;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Productdao {
	
	/*public int Createproducttable(){
		
		Connection connection=null;
		Statement statement=null;
		int count=0;
		try {
			connection=PDbconnection.CreateConnection();
			 statement=connection.createStatement();
			count=statement.executeUpdate("create table product(prodid number,prodname varchar(20),prodprice number)");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}*/
	/*public int saveproduct(Product product) throws SQLException {
		Connection connection=null;
		PreparedStatement preparedstatement=null;
		int count=0;
		try {
			//create the connection
			connection=PDbconnection.CreateConnection();
			//create the preparedstatement object
	        preparedstatement = connection.prepareStatement("insert into product values(?,?,?)");
	        //read the data from product object set the parameters
			preparedstatement.setInt(1,product.getProdid());
			preparedstatement.setString(2, product.getProdname());
			preparedstatement.setDouble(3, product.getProdprice());
			count=preparedstatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
				connection.close();
			if(preparedstatement!=null)
				preparedstatement.close();
		}
		return count;
	
		
	}*/
	/*public Product findbyId(int prodId) {
		 Product product=null;
		try(Connection connection=PDbconnection.CreateConnection();
				PreparedStatement PreparedStatement=connection.prepareStatement("select * from product where prodId=?"))
		{
			PreparedStatement.setInt(1,prodId);
			ResultSet resultSet=PreparedStatement.executeQuery();
			if(resultSet.next()) {
				product=new Product();
				product.setProdid(resultSet.getInt(1));
				product.setProdname(resultSet.getString(2));
				product.setProdprice(resultSet.getDouble(3));
		}	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return product;
	
		}*/
	/*public int deletebyId(int proId) {
		  int count=0;
		try(Connection connection=PDbconnection.CreateConnection();
				PreparedStatement PreparedStatement=connection.prepareStatement("delete from product where prodId=?"))
		{
			PreparedStatement.setInt(1,proId);
			count=PreparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	
	}*/
	/*public List<Product> findAll(){
		List<Product> pro=new ArrayList<Product>();
		try(Connection connection=PDbconnection.CreateConnection();
			Statement statement=connection.createStatement()){
			ResultSet resultset=statement.executeQuery("select * from product");
			while(resultset.next()) {
			Product product=new Product();
			product.setProdid(resultset.getInt(1));
			product.setProdname(resultset.getString(2));
			product.setProdprice(resultset.getDouble(3));
			pro.add(product);
			
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return pro;
	}*/
	/*public int Updateprice(double currentprice,double incprice) {
		int update=0;
	try(Connection connection=PDbconnection.CreateConnection();
			PreparedStatement PreparedStatement=connection.prepareStatement("UPDATE product set prodprice=prodprice+? where prodprice>?"))
	{
		 
		PreparedStatement.setDouble(1,incprice);
		PreparedStatement.setDouble(2,currentprice);
		update=PreparedStatement.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return update;
		 
}*/
	
	/*public int deletebyprice(int prodprice) {
		  int deletecount=0;
		try(Connection connection=PDbconnection.CreateConnection();
				PreparedStatement PreparedStatement=connection.prepareStatement("delete from product where prodprice>?"))
		{
			PreparedStatement.setInt(1,prodprice);
			deletecount=PreparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return deletecount;

}*/
	
	public int droptable() {
		int count=0;
		try(Connection connection=PDbconnection.CreateConnection();
				Statement statement=connection.createStatement())
		{
			statement.executeUpdate("drop table product");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
		
	}

}
