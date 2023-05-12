package com.saraya;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student
//		Student st = new Student();
//		List<Student> st1 = new ArrayList<>(List.of(new Student (2,"Moudou"),new Student (31,"Fatou"),
//				new Student (3,"Mingui")));
//		st.compareTo(st);
//		Collections.sort(st1);
//		System.out.println(st1);
		
		//Employee
		
		new Employee();
		
		//Profession
		
//		Profession prof = new Profession();
//		List<Profession> prof1 = new ArrayList<>(List.of(new Profession (18,"Aliou"),new Profession (55,"Yacine"),
//				new Profession (13,"Ousseynou"),new Profession (8,"Saifou")));
//		prof.compareTo(prof);
//		Collections.sort(prof1);
//		System.out.println(prof1);
		
		//EmployeeAsc
		
//		List<Employee> e1 = new ArrayList<>(List.of(new Employee (12,"Nafy"),new Employee (25,"Oumou"),
//				new Employee (3,"Nikita")));
//		
//		
//		
//		Collections.sort(e1,new EmployeeAsc() );
//		System.out.println(e1);
//		
//		List<Employee> e2 = new ArrayList<>(List.of(new Employee (12,"Nafy"),new Employee (25,"Oumou"),
//				new Employee (3,"Nikita")));
//		
//		
//		
//		Collections.sort(e2,new EmployeeAsc() );
//		System.out.println(e2);
		
		
//	Profession
		
		new Profession();
		List<Profession> profdsc1 = new ArrayList<>(List.of(new Profession (18,"Aliou"),new Profession (55,"Yacine"),
		new Profession (13,"Ousseynou"),new Profession (8,"Saifou")));

		Collections.sort(profdsc1);
		System.out.println(profdsc1);
		

	}

}
