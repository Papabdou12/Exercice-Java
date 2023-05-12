package com.saraya;

import java.util.Comparator;

public class EmployeeDsc  implements Comparator <Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getId_emp(), o1.getId_emp());
	}

}
