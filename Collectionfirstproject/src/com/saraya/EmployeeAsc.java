package com.saraya;

import java.util.Comparator;

public class EmployeeAsc implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return Integer.compare(emp1.getId_emp(), emp2.getId_emp());
	}


	

}
