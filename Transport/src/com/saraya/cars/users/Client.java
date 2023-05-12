package com.saraya.cars.users;
public class Client {

	private String idNumber;
	private String fullName;
	private String address;
	private String email;
	
	
	
	public Client(String idNumber, String fullName, String address, String email) {
		this.idNumber = idNumber;
		this.fullName = fullName;
		this.address = address;
		this.email = email;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

public void getInfo() {
		
		System.out.println("Id Number \t\t ClientFull Name\t\t Address\t\t Email");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(getIdNumber()+"\t\t"+getFullName()+"\t\t\t"+getAddress()+"\t\t\t"+getEmail());
	}
	
}
