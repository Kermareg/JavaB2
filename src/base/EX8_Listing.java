import java.io.File;
import java.io.IOException;

/**
 * Listing d'un dossier et déduction de la taille des différents fichiers qui le compose.
 * @author Bertrand MICHAUX
 * @version 1
 *
 */
public class EX8_Listing {

	/**
	 * Listing simple 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Utilisation d'un objet File pour le fichier. En java, tout est objet :-).
		File fichier = new File("/home/tesla/Docker");
		System.out.println("Listing des éléments du dossier : " + fichier.getPath());
		
		// Si le fichier existe on va regarder ce qu'on peut faire. Sinon on affiche un message.
		if(fichier.exists())
		{
			// Si c'est un dossier, on liste le contenu
			System.out.println("Le fichier existe, on va lister...");
			if(fichier.isDirectory())
			{
				//Utilisation d'un foreach pour le parcours des éléments
				System.out.println("\tRépertoire, éléments découvert : ");
				for (File unFichier : fichier.listFiles()) 
				{
					// Si c'est un fichier, on affiche la taille.
					if(unFichier.isFile())
						System.out.println("\t\t" + unFichier.length() + " \t:  " + unFichier.getName());
					
				}
			}
			else
				// Si c'est un fichier, on affiche directement la taille du fichier.
				System.out.println("\tTaille du fichier sélectionné : " + fichier.length());
		}
		else
			System.out.println("Le fichier n'existe pas.");
		
		
		System.exit(0);
		

	}
	


}
