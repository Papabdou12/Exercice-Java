package com.saraya;

import java.util.Comparator;

public class ProfessionDsc implements Comparator <Profession> {

	@Override
	public int compare(Profession p2, Profession p1) {
		// TODO Auto-generated method stub
		return Integer.compare(p2.compareTo(p1), p1.compareTo(p2)) ;
	}

}
