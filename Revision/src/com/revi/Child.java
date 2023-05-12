package com.revi;

public class Child  extends Car{
	
	private int speed;
	
	

	public Child() {
		super();
	}

	public Child(int year, String make, String model, Double price, String color,int speed) {
		super(year, make, model, price, color);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	public String toString() {
		return "year : "+ year+
				"\nMake : "+make+
				"\nModel : "+model+
				"\nPrice : "+price+
				"\nColor : "+color+
				"\nSpeed : "+speed;
	}
	
}
