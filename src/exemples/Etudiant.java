package exemples;

/**
 * R�-�criture d'une m�thode existante
 * @author Bertrand
 *
 */
public class Etudiant 
{
	private String nom;
	private String prenom;
	private String matricule;
	
	/**
	 * Constructeur de l'�tudiant.
	 * @param nom
	 * @param prenom
	 * @param matricule
	 */
	public Etudiant(String nom, String prenom, String matricule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
	}
	
	/** 
	 * R�-�criture de la la m�thode toString() pr�sente dans Object.<br>
	 * Appel du la m�thode originelle pour afficher le pointeur via super.toString()
	 * @return la chaine de caract�re convertie
	 */
	public String toString() {
		System.out.println("Impression demand�e");
		return "nom:" + nom + "  pr�nom:" + prenom + "  pointeur:" + super.toString();
	}


	public static void main(String[] args) {
		System.out.println("Construction d'un �tudiant");
		Etudiant e = new Etudiant("Toto","Tartanpion","totot");
		System.out.println("Affichage de l'�tudiant");
		System.out.println("\t" + e);
		System.exit(0);
	}

}
