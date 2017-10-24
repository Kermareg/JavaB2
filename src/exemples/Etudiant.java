package exemples;

/**
 * Ré-écriture d'une méthode existante
 * @author Bertrand
 *
 */
public class Etudiant 
{
	private String nom;
	private String prenom;
	private String matricule;
	
	/**
	 * Constructeur de l'étudiant.
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
	 * Ré-écriture de la la méthode toString() présente dans Object.<br>
	 * Appel du la méthode originelle pour afficher le pointeur via super.toString()
	 * @return la chaine de caractère convertie
	 */
	public String toString() {
		System.out.println("Impression demandée");
		return "nom:" + nom + "  prénom:" + prenom + "  pointeur:" + super.toString();
	}


	public static void main(String[] args) {
		System.out.println("Construction d'un étudiant");
		Etudiant e = new Etudiant("Toto","Tartanpion","totot");
		System.out.println("Affichage de l'étudiant");
		System.out.println("\t" + e);
		System.exit(0);
	}

}
