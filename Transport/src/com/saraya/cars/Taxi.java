package com.saraya.cars;

import com.saraya.cars.users.Client;
import com.saraya.cars.users.Driver;

public class Taxi {
	private String matricule;
	private int numberOfPassenger;
	private Driver driver ;
	private Client client;
	
	
	
public Taxi(String matricule, int numberOfPassenger) {
		
		if(matricule.length()>=5) {
		this.matricule = matricule;
		}
		this.numberOfPassenger = numberOfPassenger;
	}
	
	public Taxi(String matricule, int numberOfPassenger, Driver driver, Client client) {
		
		if(matricule.length()>=5) {
		this.matricule = matricule;
		}
		this.numberOfPassenger = numberOfPassenger;
		this.driver = driver;
		this.client = client;
	}
public Taxi(String matricule, int numberOfPassenger, Driver driver) {
		
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
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void getInfo() {
		
		System.out.println("Matricule\tNumerOfPassengers\tDriver's Full Name\tClient Full Name");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(getMatricule()+"\t\t\t"+getNumberOfPassenger()+"\t\t"+getDriver().getFullName()+"\t\t"+getClient().getFullName());
	}
	

}
