package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement;
	
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
<<<<<<< HEAD

=======
	
	
	
	
	
	public static void main(String[] args ) {
		Romain minus  = new Romain ("Minus",6);
		minus.nom = "minus";
		minus.force = 6;
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
	}
	

		
>>>>>>> dce47e27269b5126afd52db364cf61623187f56d
}