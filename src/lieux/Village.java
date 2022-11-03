package lieux;

import personnages.Chef;
import personnages.Gaulois;



public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	int nbVillageois;

	public Village(String nom , int NbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[NbVillageoisMax];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois ; 
		nbVillageois += 1 ; 
	}
	
	public Gaulois TrouverHabitant(int numVillageois) {
		return villageois[numVillageois-1];
	}
	
	public void afficherVillageois() {
		int i ; 
		System.out.println("Dans " + getNom() + "du chef " + chef.getNom() + " vivent les legendaires gaulois : ");
		for (i=0;i <nbVillageois ; i++) {
			System.out.println(" - "+ villageois[i].getNom());
		}
		
	}
	
	public static void main(String[] args)
	{
		Village village = new Village("Village des irréductibles",30);
		//Gaulois gaulois = village.TrouverHabitant(30);
//      aucun gaulois n'a ete mit dans le village donc cette case est vide
		Chef abracourix = new Chef("Abracourix",6,village);
		village.setChef(abracourix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois gaulois = village.TrouverHabitant(1);
		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

	}
	

	
}
