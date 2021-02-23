package citadelleProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Quartier q1 = new Quartier(3, Famille.NOBLE, "Manoir");
		Quartier q2 = new Quartier(4, Famille.NOBLE, "Chateau");
		Quartier q3 = new Quartier(3, Famille.RELIGIEUX, "Eglise");
		Quartier q4 = new Quartier(4, Famille.MARCHAND, "Marché");
		Quartier q5 = new Quartier(2, Famille.MILITAIRE, "Prison");
		Scanner scanner = new Scanner( System.in ) ;
        System.out.print( "Veuillez saisir le nombre de joueurs : " );
        int nbJoueurs = scanner.nextInt();
		//int total = q2.getCout()+q1.getCout();
		System.out.print(nbJoueurs);
	
	}
}
