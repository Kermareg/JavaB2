package heritage.enseignant;

public class TestEnseignant 
{
	public static void main(String[] args) {
		Enseignant normal = new Enseignant("Michaux", 190);
		EnseignantInterne interne = new EnseignantInterne("Lisson", 480);
		EnseignantExterne externe = new EnseignantExterne("Hanotiaux", 35);
		
		System.out.println("Enseignant normal : " + normal);
		System.out.println("Enseignant interne : " + interne);
		System.out.println("Enseignant externe : " + externe);
		
		System.exit(0);
	}

}
