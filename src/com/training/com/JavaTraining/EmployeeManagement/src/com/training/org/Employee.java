package com.training.org;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		
		System.out.println("Default Constructor");
		this.empId=0;
		this.empName=null;
		this.salary=0.0;
	}
	
	public Employee(int id, String name, double sal) {
		
	//	System.out.println("Parameterized Constructor");
		this.empId=id;
		this.empName=name;
		this.salary=sal;
	}
	
	public String toString() {
		return "|  "+this.empId+"  |  "+this.empName+"  |  "+this.salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
