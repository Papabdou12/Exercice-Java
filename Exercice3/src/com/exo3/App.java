package com.exo3;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre = new Livre("une si long letrre","mariama ba",45,1500);
		System.out.println("Titre: "+livre.getTitre()+ " "+"Auteur: "+livre.getAuteur()+" "+" Nombre de Livre"+livre.getNb_page()+" "+"Prix: "+livre.getPrix());
		BD bd = new BD("une si long letrre","mariama ba",45,150.0,"true");
		
		

	}

}
