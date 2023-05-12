package com.exo3;

public class BD extends Livre {

	private String  color;

	public BD() {
	}

	public BD(String titre, String auteur, int nb_page, double prix, String color) {
		super(titre, auteur, nb_page, prix);
		this.color = color;
	}

	
	public String  getColor() {
		return color;
	}

	
	public void setColor(String  color) {
		this.color = color;
	}

	

	
	
	
	
	
	
	
	
}
