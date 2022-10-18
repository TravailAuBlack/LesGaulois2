package lieux;

import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0 ;
	int tabVillageois [];
	private int nbVillageoisMaximum ;
	
	
	public Village(String nom) {
		this.nom = nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
}
