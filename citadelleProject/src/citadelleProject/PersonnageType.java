package citadelleProject;

public enum PersonnageType {
	ASSASSIN(null),
	VOLEUR(null),
	MAGICIEN(null),
	ROI(Famille.NOBLE),
	EVEQUE(Famille.RELIGIEUX),
	MARCHAND(Famille.MARCHAND),
	ARCHITECTE(null),
	CONDOTIERRE(Famille.MILITAIRE);
	
	private Famille famille;  
    
    private PersonnageType(Famille famille) {  
        this.famille = famille ;  
   }  
     
    public Famille getFamille() {  
        return  this.famille ;  
   }  

}
