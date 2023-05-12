package com.revi;

public class Person {

	private String name;
	private Address ad;
	
	public Person() {}
	
	public Person(String name, Address ad) {
		this.name = name;
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Person:\nname=" + name + ",\n" + ad ;
	}

	
	
	
	
}
