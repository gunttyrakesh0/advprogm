package com.sathya.tech;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Productdao {

	public int save(Product product) 
	{
		//declare the resources
		Connection connection=null;
		PreparedStatement PreparedStatement=null;
		int saveresult=0;
		try {
			 //get the connection
			connection=Productdatabase.createConnection();
			//create preparedstatement object
			PreparedStatement=connection.prepareStatement("insert into productdata values(?,?,?,?,?,?,?,?,?,?)");
			
			 //read the data form product set the data
			
			PreparedStatement.setString(1,product.getProId());
			PreparedStatement.setString(2, product.getProName());
			PreparedStatement.setDouble(3, product.getProprice());
			PreparedStatement.setString(4,product.getProBrand());
			PreparedStatement.setString(5,product.getProMadeIn());
			PreparedStatement.setDate(6,product.getProMfgDate());
			PreparedStatement.setDate(7,product.getProExpDate());
			PreparedStatement.setBytes(8,product.getProImage());
			PreparedStatement.setBytes(9, product.getProAudio());
			PreparedStatement.setBytes(10, product.getProvideo());
			saveresult=PreparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(connection!=null)
				connection.close();
			if(PreparedStatement!=null)
				PreparedStatement.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return saveresult;
	}
	public List<Product> findAll(){
		
	List<Product> productlist=new ArrayList<Product>();
	Product product=null;
	
	try(Connection connection=Productdatabase.createConnection();
		Statement statement=connection.createStatement()){
		ResultSet resultset=statement.executeQuery("select * from productdata");
		
		while(resultset.next()) {
			
		  product=new Product();
		  product.setProId(resultset.getString("proId"));
	      product.setProName( resultset.getString("proName"));
	      product.setProprice( resultset.getDouble("proPrice"));
	      product.setProBrand( resultset.getString("proBrand"));
	      product.setProMadeIn(resultset.getString("proMadeIn"));
	      product.setProMfgDate( resultset.getDate("proMfgDate"));
	      product.setProExpDate( resultset.getDate("proExpDate"));
	      product.setProImage(resultset.getBytes("proImage"));
	      product.setProAudio(resultset.getBytes("proAudio"));
	      product.setProvideo(resultset.getBytes("provideo"));
	      productlist.add(product);
	      
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return productlist;
	}
	public int deletebyId(String proId) {
		  int count=0;
		try(Connection connection=Productdatabase.createConnection();
				PreparedStatement PreparedStatement=connection.prepareStatement("delete from productdata where proId=?"))
		{
			PreparedStatement.setString(1,proId);
			count=PreparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
	public Product findbyId(String proId) {
		 Product product1=null;
		try(Connection connection=Productdatabase.createConnection();
				PreparedStatement PreparedStatement=connection.prepareStatement("select * from productdata where proId=?"))
		{
			PreparedStatement.setString(1,proId);
			ResultSet resultset=PreparedStatement.executeQuery();
			if(resultset.next()) {
				  product1=new Product();
				 product1.setProId(resultset.getString("proId"));
			      product1.setProName( resultset.getString("proName"));
			      product1.setProprice( resultset.getDouble("proPrice"));
			      product1.setProBrand( resultset.getString("proBrand"));
			      product1.setProMadeIn(resultset.getString("proMadeIn"));
			      product1.setProMfgDate( resultset.getDate("proMfgDate"));
			      product1.setProExpDate( resultset.getDate("proExpDate"));
			      product1.setProImage(resultset.getBytes("proImage"));
//			      product1.setProAudio(resultset.getBytes("proAudio"));
//			      product1.setProvideo(resultset.getBytes("provideo"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return product1;
	}

	public int UpdateProductList(Product p) {
		int update=0;
	try(Connection connection=Productdatabase.createConnection();
			PreparedStatement PreparedStatement=connection.prepareStatement("UPDATE productdata SET proName=?, proprice=?,proBrand=?,proMadeIn=?,proMfgDate=?,proExpDate=?,proImage=? WHERE proId=?"))
	{
		 
		   
	      PreparedStatement.setString( 1,p.getProName());
	      PreparedStatement.setDouble( 2,p.getProprice());
	      PreparedStatement.setString( 3,p.getProBrand());
	      PreparedStatement.setString( 4,p.getProMadeIn());
	      PreparedStatement.setDate(5,p.getProMfgDate());
	      PreparedStatement.setDate( 6,p.getProExpDate());
	      PreparedStatement.setBytes(7,p.getProImage());
//	      PreparedStatement.setBytes(8,p.getProAudio());
//	      PreparedStatement.setBytes(9,p.getProvideo());
	      PreparedStatement.setString(8,p.getProId());
	      
	      update=PreparedStatement.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return update;
	}
	 
	
}
