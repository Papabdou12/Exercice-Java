package com.saraya.cars.users;

public class Driver {
	private String idNumber;
	private String fullName;
	private Double	salary ;
	
	
	
	public Driver(String idNumber, String fullName, Double salary) {
		this.idNumber = idNumber;
		this.fullName = fullName;
		this.salary = salary;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
public void getInfo() {
		
		System.out.println("Id Number\t\t Driver's Full Name\t\t Salary");
		System.out.println("------------------------------------------------------");
		System.out.println(getIdNumber()+"\t\t"+getFullName()+"\t\t"+getSalary());
	}
	
}
