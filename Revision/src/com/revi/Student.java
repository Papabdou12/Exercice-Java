package com.revi;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int[] marks;
	
	
	public Student() {
		super();
	}


	public Student(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	public int totalMark() {
		int numberOfMark =marks.length;
			return numberOfMark;
	}
	
	
	
	public  int maximumMark() {
		
		  int maxMark =  marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i] > maxMark) {
				maxMark = marks[i]; 
			}
			
		}
		return maxMark;
	}
	
	
	
	
	public int minimumMark() {
		
		  int minMark =  marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i] < minMark) {
				minMark = marks[i]; 
			}
			
		}
		return minMark;
	}
	
	
	
	public int sumOfMark() {
		
		int sum=0;
		for(int i=0 ; i<marks.length; i++) {
			sum+=marks[i];
			
		}
		
		return sum;
	}
	
	
	public float averageMark() {
		int sum=0;
		for(int i=0 ; i<marks.length; i++) {
			sum+=marks[i];

//			BigDecimal b = new BigDecimal(sum);
//			BigDecimal b1 = new BigDecimal(marks.length);
//			 AVG=  b.divide(b1) ;
			}
		float AVG = (float) sum /marks.length;
		return AVG;
	}


	@Override
	public String toString() {
		return "Student name=" + name +
				"\tmarks=" + Arrays.toString(marks) ;
				
	}
	
	

	
	

}
