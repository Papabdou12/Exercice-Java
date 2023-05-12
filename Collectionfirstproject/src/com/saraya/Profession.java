package com.saraya;

public class Profession implements Comparable <Profession>{
	private int id_prof;
	private String nameProfession;
	
	
	
	public Profession(int id_prof, String nameProfession) {
		super();
		this.id_prof = id_prof;
		this.nameProfession = nameProfession;
	}


	public Profession() {}
	

	@Override
	public String toString() {
		return "Profession id_prof=" + id_prof + ", nameProfession=" + nameProfession ;
	}


	@Override
	public int compareTo(Profession i) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id_prof, i.id_prof);
	}



}
