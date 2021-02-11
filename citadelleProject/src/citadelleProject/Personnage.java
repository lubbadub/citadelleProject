package citadelleProject;

public class Personnage {
	private int ordre;
	private PersonnageType nom;
	private String famille;
	
	
	public Personnage(int ordre, PersonnageType nom, String famille) {
		super();
		this.ordre = ordre;
		this.nom = nom;
		this.famille = famille;
	}
	public int getOrdre() {
		return ordre;
	}
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	public PersonnageType getNom() {
		return nom;
	}
	public void setNom(PersonnageType nom) {
		this.nom = nom;
	}
	public String getFamille() {
		return famille;
	}
	public void setFamille(String famille) {
		this.famille = famille;
	}
	
	


}
