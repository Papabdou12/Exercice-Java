package com.revi;

public class Car {
	
	protected int year;
	protected String make;
	protected String model;
	protected Double price;
	protected String color;
	
	
	
	
	public Car() {}
	public Car(int year, String make, String model, Double price, String color) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
		this.color = color;
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String toString() {
		return "year : "+ year+
				"\nMake : "+make+
				"\nModel : "+model+
				"\nPrice : "+price+
				"\nColor : "+color;
	}
	

}
