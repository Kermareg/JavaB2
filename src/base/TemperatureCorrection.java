package base;

import java.util.Scanner;

/**
 * Correction de l'exercice de gestion de température
 * @author Bertrand
 * @version 1
 *
 */
public class TemperatureCorrection 
{
	private double temperatureC;
	
	/**
	 * Constructeur par défaut
	 * Température mise par défaut à 0°C
	 */
	public TemperatureCorrection()
	{
		temperatureC=0;
	}
	
	/**
	 * Constructeur avec initialisation de la température
	 * @param celsius - température d'initialisation
	 */
	public TemperatureCorrection(double celsius)
	{
		setCelsius(celsius);
	}
	
	/**
	 * Modifie la température encodée
	 * @param celsius - nouvelle température
	 */
	public void setCelsius(double celsius) 
	{
		temperatureC=celsius;
	}
	
	/**
	 * Récupération de la température en °C
	 * @return
	 */
	public double getCelsius()
	{
		return temperatureC;
	}
	
	/**
	 * Récupération de la température en °F
	 * @return
	 */
	public double getFarenheit()
	{
		return 1.8 * temperatureC + 32.0;
	}
	
	/**
	 * Modifie la température encodée
	 * @param farenheit - nouvelle température
	 */
	public void setFarenheit(double farenheit)
	{
		temperatureC = (farenheit-32.0)/1.8;
	}
	
	// Ré-écriture de la méthode d'impression console pour plus de convenance.
	@Override
	public String toString() 
	{
		return "C° : " + getCelsius() + "\nF° : " + getFarenheit();
	}
	
	/**
	 * Formulaire de récupération d'une donnée pour éviter des répétitions dans le code.
	 * @param sc - le scanner
	 * @return - la température saisie sous forme de double.
	 */
	private static double askTemp(Scanner sc)
	{
		double saisie = sc.nextDouble();
		sc.nextLine();
		return saisie;
	}

	public static void main(String[] args) {
		System.out.println("Essai de la classe température");

		// Création d'un scanner
		Scanner sc = new Scanner(System.in);
		String buffer="";
		TemperatureCorrection t = new TemperatureCorrection();
		do
		{
			System.out.println("q : quitter \t1 = setFarenheit \t2 = setCelsius \tp = print");
			buffer = sc.nextLine();		// Récupération d'une action à faire.
			switch (buffer) {
			case "1":
				System.out.print("Nouvelle température : ");
				t.setFarenheit(askTemp(sc));
				sc.nextLine();
				System.out.println(t);
				break;
			case "2":
				System.out.print("Nouvelle température : ");
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
