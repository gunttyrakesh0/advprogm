package com.sathya.tech;

public class Employee {
	int empId;
	String empName;
	double empsalary;
	public Employee(int empId, String empName, double empsalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empsalary;
	}
	public Employee() {
		 
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	}
	
	

}
