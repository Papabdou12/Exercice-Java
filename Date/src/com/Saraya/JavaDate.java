package com.Saraya;

import java.time.LocalDate;

public class JavaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();// Pour voir le days du jour
		System.out.println(today);
		
		LocalDate yesterday = today.minusDays(1);// Pour voir le days du jour
		System.out.println(yesterday);

	}

}
