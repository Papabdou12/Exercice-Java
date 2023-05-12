package com.revi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Car car1 = new Car(2020,"Teslsa","Model X",1500.0,"Black");
		
		System.out.println(car1);
		System.out.println("----------------------------------------");
		
	Child child = new Child(2020,"Cadillak","Light Blue",4500.0,"Blue",250);
		System.out.println(child);
		*/
		
Student st = new Student("Fatou", new int[] {13,5,155,16,5,105});
		
		System.out.println(st);
		System.out.println("----------------------------------------------------------------------");

		st.totalMark();
		st.maximumMark();
		
		st.minimumMark();
		
		st.sumOfMark();
		
		st.averageMark();
		
	}

}
