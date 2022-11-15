package personnages;

public enum Equipement {
	CASQU("casque"),
	BOUCLIER("bouclier");
	
	private String nom;
	
	
private Equipement (String nom) {
	this.nom = nom;
	
}

public String getNom() {
	return nom;
}

public String toString () {
	return "Equipement [nomEquipement=" +nom+ "]";
}
	
} 
