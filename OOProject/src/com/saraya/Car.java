package com.saraya;

public class Car {

	private String make;
	private String model;
	private String color;
	private boolean start;
	
	
	/** Constructeur*/
	
	public Car(String make, String model, String color, boolean start){
		this.make = make;
		this.model= model;
		this.color = color;
		this.start = start;
	}
	
	
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param colro the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the start
	 */
	public boolean isStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(boolean start) {
		this.start = start;
	}
	public void  getInfo() {
		System.out.println("Make:"+getMake()+ "Model:"+ getModel()+ "Color:"+getColor()+ "Start:"+ isStart());
	}
	
}
