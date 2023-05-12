package com.revi;

public class Address {
private int numberhouse;
private String street;
private String city;
private String states;
private int zipcodes;


public Address() {
	super();
}


public Address(int numberhouse, String street, String city, String states, int zipcodes) {
	super();
	this.numberhouse = numberhouse;
	this.street = street;
	this.city = city;
	this.states = states;
	this.zipcodes = zipcodes;
}


@Override
public String toString() {
	return "Address\n: numberhouse=" + numberhouse + ",\nstreet=" + street + ",\ncity=" + city + ", \nstates=" + states
			+ ",\nzipcodes=" + zipcodes ;
}




}
