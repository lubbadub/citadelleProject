package citadelleProject;

import java.util.ArrayList;

public class Joueur {

	private Personnage personnage;
	private ArrayList<Quartier> quartiers; 
	private int nbPiece;
	
	public Joueur(ArrayList<Quartier> quartiers, int nbPiece) {
		super();
		this.quartiers = quartiers;
		this.nbPiece = nbPiece;
	}

	public Personnage getPersonnage() {
		return personnage;
	}

	public void setPersonnage(Personnage personnage) {
		this.personnage = personnage;
	}

	public ArrayList<Quartier> getQuartiers() {
		return quartiers;
	}

	public void setQuartiers(ArrayList<Quartier> quartiers) {
		this.quartiers = quartiers;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}
	
	
	
	
}
