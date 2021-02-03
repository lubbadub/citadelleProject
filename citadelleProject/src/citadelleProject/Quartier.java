package citadelleProject;

public class Quartier {
	
	
public Quartier(int cout, String famille, String nom) {
		super();
		this.cout = cout;
		this.famille = famille;
		this.nom = nom;
	}
public int getCout() {
		return cout;
	}
	public void setCout(int cout) {
		this.cout = cout;
	}
	public String getFamille() {
		return famille;
	}
	public void setFamille(String famille) {
		this.famille = famille;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
private int cout;
private String famille;
private String nom;

}
