package exemples;

import javax.swing.JOptionPane;

public class Surcharge 
{
	private int[] tableau;
	private String[] tabStr;
	
	/**
	 * Constructeur pour un tableau d'entier
	 * @param tableau
	 */
	public Surcharge(int[] tableau)
	{
		// This permet de différencier la variable d'instance à la variable local
		// de méthode. Utile en cas de nom de variable similaires.
		this.tableau=tableau;
	}
	
	/**
	 * Surcharge pour constructeur sur une tableau de String
	 * @param tableau
	 */
	public Surcharge(String[] tableau)
	{
		tabStr=tableau;
	}
	
	/**
	 * Affiche tableau d'entier avec un foreach
	 */
	public void affiche()
	{
		for(int temporaire : tableau)
		{
			System.out.println("" + temporaire);
		}
		
	}
	
	/**
	 * Affiche un tableau de String avec "for condition"
	 */
	public void afficheStr()
	{
		for(int i=0; i< tabStr.length; i++)
			System.out.println(tabStr[i]);
	}
	
	public void afficheStr(boolean horizontal)
	{
		if(horizontal)
		{
			for(int i=0; i< tabStr.length; i++)
				System.out.print(tabStr[i] + "  "  );
			System.out.println();
			
		}
		else
			afficheStr();
	}
	
	

	public static void main(String[] args) 
	{
		int[] tableauDeTest = {10,20,30,40,50};
		String[] tabChaine = {"Chaine 1", "Chaine 2", "Chaine 3"};
		Surcharge test = new Surcharge(tableauDeTest); 
		Surcharge testChaine = new Surcharge(tabChaine);
		test.affiche();
		
		System.out.println("Utilisation méthodes surchargées");
		System.out.println("Affichage \"par défaut\"");
		testChaine.afficheStr();
		System.out.println("Affichage horizontal = true");
		testChaine.afficheStr(true);
		System.out.println("Affichage horizontal = false");
		testChaine.afficheStr(false);
		
		// Chainage de l'appel de la méthode showConfirmDialog qui passe dans un test
		// pour vérifier si on a appuyé sur YES ou sur un autre bouton.
		boolean typeAffichage = JOptionPane.showConfirmDialog(null, "Voulez-vous afficher en horizontal ?") == JOptionPane.YES_OPTION;
		System.out.println("Affichage avec retour de dialogue : ");
		testChaine.afficheStr(typeAffichage);
		System.exit(0);

	}

}

