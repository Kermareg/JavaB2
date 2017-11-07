package tableaux;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TableauDynamique 
{
	// Constante permettant de figer la taille maximale du tableau
	// Le mot clef final permet d'empêcher toute modification après assignation.
	static final int TAILLE_BUFFER = 10;
	
	// L'espace réservé au tableau
	private String[] data = new String[TAILLE_BUFFER];
	
	// Nombre des éléments en mémoire.
	private int taille=0;
	
	public TableauDynamique()
	{
		initTableau();
	}

	private void initTableau() {
		for(int i=0;i<data.length;i++)
			data[i] = "";
		taille=0;
	}
	
	public void addElement(String element)
	{
		if(taille<data.length)
		{
			data[taille]=element;
			taille++;
		}
		else
			System.out.println("Tableau full");
		printTableau();
	}
	
	public void printTableau()
	{
		for(String lat:data)
			System.out.print(lat + "\t");
		System.out.println("");
	}

	public static void main(String[] args) 
	{
		System.out.println("Création d'un tableau");
		String command="";
		Scanner sc = new Scanner(System.in);
		
		TableauDynamique t= new TableauDynamique();

		JOptionPane.showMessageDialog(null, "Message de test");
		JOptionPane.showInputDialog("Entrez une valeur : ");
		System.out.println("Programme terminé");
		
		sc.close();
		System.exit(0);
	}
	
	

}
