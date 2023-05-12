package com.saraya.cars;

import com.saraya.cars.users.Driver;

public class Bus {

	private String matricule;
	private int numberOfPassenger;
	private Driver driver;
	

	public Bus(String matricule, int numberOfPassenger) {
		if(matricule.length()>=5) {
			this.matricule = matricule;
			}
		this.numberOfPassenger = numberOfPassenger;
	}
	public Bus(String matricule, int numberOfPassenger, Driver driver) {
		if(matricule.length()>=5) {
			this.matricule = matricule;
			}
		this.numberOfPassenger = numberOfPassenger;
		this.driver = driver;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
public void getInfo() {
		
		System.out.println("Matricule\tNumerOfPassengers\tDriver's Full Name");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(getMatricule()+"\t\t"+getNumberOfPassenger()+"\t\t"+getDriver().getFullName());
	}
}
