package com.exo3;

public class Livre {
	
	private String titre;
	private String auteur;
	private int nb_page;
	private double prix;
	
	
	public Livre() {
		
	}


	public Livre(String titre, String auteur, int nb_page, double prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.nb_page = nb_page;
		this.prix = prix;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public int getNb_page() {
		return nb_page;
	}


	public void setNb_page(int nb_page) {
		this.nb_page = nb_page;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
	
	

}
