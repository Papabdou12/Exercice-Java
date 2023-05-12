package com.saraya;

public class Student implements Comparable <Student> {

	private int id_Stud;
	private String name;
	
	
	public Student() {}
	
	public Student(int id_Stud, String name) {
		super();
		this.id_Stud = id_Stud;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student  id_Stud=" + id_Stud + ", name=" + name ;
	}



	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id_Stud, s.id_Stud);
	}
	
	
}
