package com.sathya.tech;

import java.sql.SQLException;
import java.util.List;

public class Productclient {

	public static void main(String[] args) throws SQLException  {
		Productdao productdao= new Productdao();
		
		/*int result=productdao.Createproducttable();
			System.out.println(result);*/
		
		/*int res1=productdao.saveproduct(new Product(101,"TV",50000));
		System.out.println(res1);
		

		int res2=productdao.saveproduct(new Product(102,"mobile",70000));
		System.out.println(res2);
		

		int res3=productdao.saveproduct(new Product(103,"laptop",55000));
		System.out.println(res3);
		

		int res4=productdao.saveproduct(new Product(104,"earbuds",5000));
		System.out.println(res4);
		
		int res5=productdao.saveproduct(new Product(105,"Djbox",25000));
		System.out.println(res5);*/
		
	 /*Product prod=productdao.findbyId(101);
	 System.out.println(prod);*/
		
		/*int delcount=productdao.deletebyId(102);
		System.out.println(delcount);*/
		
		/*List<Product> product1=productdao.findAll();
		product1.forEach(s->System.out.println(s));*/
		
		/*int update1=productdao.Updateprice(25000, 30000);
		System.out.println(update1);*/
		
		/*int delecount1=productdao.deletebyprice(75000);
		System.out.println(delecount1);*/
		
		int count2=productdao.droptable();
		System.out.println(count2);
	}

}
