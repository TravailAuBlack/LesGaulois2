package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1 ;
	private Object potion;

	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller "
				+ "d'une force " + effetPotionMin + " � "+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion()
	{
		this.potion =  Radom(effetPotionMax);
	}
	private Object Radom(int forcePotion) {
		potion = forcePotion;
		if (potion>7)
		{
			parler(" J'ai préparé une super potion de force");
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force");
		}
		
		
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
	}
}

  
