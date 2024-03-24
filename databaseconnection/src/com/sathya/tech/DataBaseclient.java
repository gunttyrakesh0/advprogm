package com.sathya.tech;

import java.sql.SQLException;
import java.util.List;

public class DataBaseclient {
	public static void main(String[] args) throws SQLException {
		EmployeeDao employeedao= new EmployeeDao();
		int res1=employeedao.save(new Employee(111,"rakesh",50000.00));
		System.out.println(res1);
		
		
		Employee emp=employeedao.findbyId(111);
		System.out.println(emp);
		
		/*int deletecount=employeedao.deletebyId(111);
		if(deletecount==1)
			System.out.println("deleted sucessfully");
		else
			System.out.println("deletion failed");*/
		
		/*int noofdeletion=employeedao.deletebysalary(25000);
		if(noofdeletion!=0)
			System.out.println("deletion successfully"+noofdeletion);
		else
			System.out.println("deletion failed"+noofdeletion);*/
		
		List<Employee> emp1=employeedao.findAll();
		for(Employee e:emp1)
			System.out.println(e);
		
		int update1=employeedao.UpdateSalary(25000, 20000);
		if(update1!=0)
			System.out.println("updated sucessfully");
				
	}

}
