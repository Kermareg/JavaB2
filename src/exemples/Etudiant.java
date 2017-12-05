package exemples;

public class Etudiant extends Personne {
	protected String matricule;

	public Etudiant(String n, String p) {
		super(n,p);
		matricule = "Non d�fini";
		System.out.println("Cr�ation d'un �tudiant : " + n);
	}
	
	public Etudiant(String n, String p, String matricule)
	{
		super(n,p);
		this.matricule = matricule;
	}
	
	public void affiche()
	{
		super.affiche();
		System.out.println("\tMatricule : " + matricule);
	}

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + "]";
	}
	
	

}
