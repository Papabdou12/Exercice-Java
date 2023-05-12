package com.saraya;

public class Employee implements Comparable <Employee>{
	private int id_emp;
	private String name;
	
	
	public Employee() {}

	
	public Employee(int id_emp, String name) {
		super();
		this.setId_emp(id_emp);
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Employee id_emp=" + getId_emp() + ", name=" + name ;
	}



	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare( o.getId_emp(),this.getId_emp());
	}


	
	public int getId_emp() {
		return id_emp;
	}


	
	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}
	
	

}
