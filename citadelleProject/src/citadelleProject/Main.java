package citadelleProject;

public class Main {

	public static void main(String[] args) {
		Quartier q1 = new Quartier(3, "Noble", "Manoir");
		Quartier q2 = new Quartier(4, "Noble", "Chateau");
		int total = q2.getCout()+q1.getCout();
		System.out.print(total);

	}

}
