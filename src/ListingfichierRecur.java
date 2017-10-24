import java.io.File;

/**
 * Utilisation d'une méthode récursive pour parcourir l'arborescence 
 * complète d'un dossier.
 * @author Bertrand MICHAUX
 * @version 1
 * 
 */
public class ListingfichierRecur 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Utilisation de l'objet File
		File fichier = new File("/home/tesla/Docker");
		System.out.println("Listing des éléments du dossier : " + fichier.getPath());
		
		// Si le fichier existe
		if(fichier.exists())
		{
			// Démarrage de la récursion
			tailleFichier(fichier);
		}
		System.out.println("Fin de l'exécution");
		System.exit(0);

	}

	/**
	 * Méthode récursive. Attention à son usage pour ne pas dépasser la pile (<i>StackOverFlowError</i>).
	 * @see java.lang.StackOverflowError
	 * @param fichier
	 */
	private static void tailleFichier(File fichier) 
	{
		// Cas de base : c'est un fichier, on affiche la taille, la méthode "se termine"
		if(fichier.isFile())
			System.out.println("\t" + fichier.length() + "\t" + fichier.getAbsoluteFile());
		else
		{
			// Cas général : c'est un dossier, qui contient possiblement des fichiers (et dossiers)
			// On rappelle donc la même méthode et on "ploge" dans les éléments listés.
			for (File temporaire : fichier.listFiles()) 
			{
				tailleFichier(temporaire);				
			}
		}
		
	}


}
