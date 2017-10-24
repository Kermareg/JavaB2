package base;

import java.util.Scanner;

public class EX5_Calculatrice 
{
	public static void main(String[] args) {
		System.out.println("Réalisation d'une calculatrice");

		Scanner sc = new Scanner(System.in);
		char operation;
		// Tant que l'opération n'est pas "q", on continue de demander.
		do
		{
			System.out.print("Choisissez votre opération (+ - * /) : ");
			operation = sc.nextLine().charAt(0);
			switch (operation) {
			case '+':
				System.out.println("Résultat de l'addition : " + addition(sc));
				sc.nextLine();
				break;
			case '-':
				System.out.println("Résultat de la soustraction : " + soustraction(sc));
				sc.nextLine();
				break;
			case '*':
				System.out.println("Résultat de la multiplication : " + multiplication(sc));
				sc.nextLine();
				break;
			case '/':
				System.out.println("Résultat de la division : " + division(sc));
				sc.nextLine();
				break;

			default:

				break;
			}
			

		}while(operation != 'q');

		sc.close();

		System.out.println("Terminé");
		System.exit(0);
	}

	/**
	 * Méthode d'exécution de la division
	 * @param sc
	 * @return
	 */
	private static double division(Scanner sc) 
	{
		double d1, d2,resultat;
		System.out.print("Entrez le premier nombre : ");
		d1=sc.nextDouble();
		System.out.print("Entrez le second nombre : ");
		d2=sc.nextDouble();
		resultat = d1/d2;
		return resultat;
	}

	/**
	 * Méthode d'exécution de la multiplication
	 * @param sc
	 * @return
	 */
	private static double multiplication(Scanner sc) 
	{
		double d1,d2, resultat;
		System.out.print("Entrez le premier nombre : ");
		d1=sc.nextDouble();
		System.out.print("Entrez le second nombre : ");
		d2=sc.nextDouble();
		resultat = d1*d2;
		return resultat;
	}

	/**
	 * Méthode d'exécution de la soustraction
	 * @param sc
	 * @return
	 */
	private static double soustraction(Scanner sc) 
	{
		double d1, d2, resultat;
		System.out.print("Entrez le premier nombre : ");
		d1=sc.nextDouble();
		System.out.print("Entrez le second nombre : ");
		d2=sc.nextDouble();
		resultat = d1-d2;
		return resultat;
	}

	/**
	 * Méthode d'exécution de l'addition.
	 * @param sc
	 * @return
	 */
	private static double addition(Scanner sc) 
	{
		double d1,d2, resultat;
		System.out.print("Entrez le premier nombre");
		d1=sc.nextDouble();
		System.out.print("Entrez le second nombre");
		d2=sc.nextDouble();
		resultat = d1+d2;
		return resultat;
	}

}
