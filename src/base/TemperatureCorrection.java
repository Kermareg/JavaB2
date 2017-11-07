package base;

import java.util.Scanner;

/**
 * Correction de l'exercice de gestion de temp�rature
 * @author Bertrand
 * @version 1
 *
 */
public class TemperatureCorrection 
{
	private double temperatureC;
	
	/**
	 * Constructeur par d�faut
	 * Temp�rature mise par d�faut � 0�C
	 */
	public TemperatureCorrection()
	{
		temperatureC=0;
	}
	
	/**
	 * Constructeur avec initialisation de la temp�rature
	 * @param celsius - temp�rature d'initialisation
	 */
	public TemperatureCorrection(double celsius)
	{
		setCelsius(celsius);
	}
	
	/**
	 * Modifie la temp�rature encod�e
	 * @param celsius - nouvelle temp�rature
	 */
	public void setCelsius(double celsius) 
	{
		temperatureC=celsius;
	}
	
	/**
	 * R�cup�ration de la temp�rature en �C
	 * @return
	 */
	public double getCelsius()
	{
		return temperatureC;
	}
	
	/**
	 * R�cup�ration de la temp�rature en �F
	 * @return
	 */
	public double getFarenheit()
	{
		return 1.8 * temperatureC + 32.0;
	}
	
	/**
	 * Modifie la temp�rature encod�e
	 * @param farenheit - nouvelle temp�rature
	 */
	public void setFarenheit(double farenheit)
	{
		temperatureC = (farenheit-32.0)/1.8;
	}
	
	// R�-�criture de la m�thode d'impression console pour plus de convenance.
	@Override
	public String toString() 
	{
		return "C� : " + getCelsius() + "\nF� : " + getFarenheit();
	}
	
	/**
	 * Formulaire de r�cup�ration d'une donn�e pour �viter des r�p�titions dans le code.
	 * @param sc - le scanner
	 * @return - la temp�rature saisie sous forme de double.
	 */
	private static double askTemp(Scanner sc)
	{
		double saisie = sc.nextDouble();
		sc.nextLine();
		return saisie;
	}

	public static void main(String[] args) {
		System.out.println("Essai de la classe temp�rature");

		// Cr�ation d'un scanner
		Scanner sc = new Scanner(System.in);
		String buffer="";
		TemperatureCorrection t = new TemperatureCorrection();
		do
		{
			System.out.println("q : quitter \t1 = setFarenheit \t2 = setCelsius \tp = print");
			buffer = sc.nextLine();		// R�cup�ration d'une action � faire.
			switch (buffer) {
			case "1":
				System.out.print("Nouvelle temp�rature : ");
				t.setFarenheit(askTemp(sc));
				sc.nextLine();
				System.out.println(t);
				break;
			case "2":
				System.out.print("Nouvelle temp�rature : ");
				t.setCelsius(askTemp(sc));
				System.out.println(t);
				break;
			case "p":
				System.out.println(t);
				break;				
			case "q":
				System.out.println("Demande de quitter");

			default:
				System.out.println("Commande non reconnue.");
				break;
			}
			System.out.println();
		}while(!buffer.equals("q"));
		
		sc.close();
		System.exit(0);
		
				
	}

}
