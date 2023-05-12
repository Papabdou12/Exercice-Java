package com.saraya.cars;
import com.saraya.cars.users.Client;
import com.saraya.cars.users.Driver;

public class PersonalCar {
	
	private String matricule;
	private int numberOfPassenger;
	private	Boolean  withDriver;
	private Driver driver;
	private Client client;
	
	
	
	public PersonalCar(String matricule, int numberOfPassenger, Boolean withDriver, Driver driver, Client client) {
		if(matricule.length()>=5) {
			this.matricule = matricule;
			}
		this.numberOfPassenger = numberOfPassenger;
		this.withDriver = withDriver;
		if(withDriver = true) {
			this.driver = driver;
			}
		this.client = client;
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
	public Boolean getWithDriver() {
		return withDriver;
	}
	public void setWithDriver(Boolean withDriver) {
		this.withDriver = withDriver;
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
		
		System.out.println("Matricule\t NumerOfPassengers\t WithDriver\t\t\t Driver's Full Name\t\tClient Full Name");
		System.out.println("---------------------------------------------------------------------------------------------"
				+ "-----------------------------------------------------");
		System.out.println(getMatricule()+"\t\t\t"+getNumberOfPassenger()+"\t\t\t"+getWithDriver()+"\t\t\t\t"
		+getDriver().getFullName()+"\t\t"+getClient().getFullName());
	}
}
