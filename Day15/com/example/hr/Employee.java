package com.example.hr;

public class Employee {
	
	
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name,int id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void printName() {
		System.out.println("Employee Name : "+name);
	}

	public void printSalary() {
		System.out.println("Salary : " +salary);
	}


	
	
	
	
}
