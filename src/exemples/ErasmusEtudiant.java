package exemples;

public class ErasmusEtudiant extends Etudiant 
{
	private String universiteOrigine;

	public ErasmusEtudiant(String n, String p, String matricule, String unif) {
		super(n, p, matricule);
		universiteOrigine = unif;
	}

	public void affiche() 
	{
		/*System.out.println("Etudiant Erasmus : \n\tOrigine : " + universiteOrigine
				+ "\n\tMatricule : " + matricule
				+ "\n\tNom : " + getNom());*/
		super.affiche();
		System.out.println("\tUniversité d'origine : " + universiteOrigine);
		
	}
	
	public void afficheUniversiteOrigine()
	{
		System.out.println(universiteOrigine);
	}

}
