package histoire;


import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;


public class Scenario {
	
	public static void main(String[] args) {
<<<<<<< HEAD
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obelix",8);
		Romain minus  = new Romain ("Minus",20);
		Druide panoramix = new Druide ("Panoramix",5,10);
		//asterix.parler("Bonjour à tous");
		//minus.parler("UN GAU... UN GAUGAU...");
		//asterix.frapper(minus);
		//asterix.frapper(minus);
		//asterix.frapper(minus);
=======
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus  = new Romain ("Minus",-6);
>>>>>>> dce47e27269b5126afd52db364cf61623187f56d
		
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		while(minus.getForce() >0) 
		{
		asterix.frapper(minus);
<<<<<<< HEAD
		}
		
		
		
		
		
		// TODO Auto-generated method stub
=======
		// TOD-generated method stub
>>>>>>> dce47e27269b5126afd52db364cf61623187f56d

	}

}
