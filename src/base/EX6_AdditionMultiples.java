package base;

import java.util.Scanner;

public class EX6_AdditionMultiples {

	public static void main(String[] args) {
		// Addition mutiples.
		System.out.println("Additionner les nombres entr�s par l'utilisateur tant qu'il n'a pas rentr� autre chose qu'un nombre.");
		Scanner sc = new Scanner(System.in);
		long somme = 0;

		String saisie;
		do
		{
			System.out.print("Entrez un nombre � additionner : ");
			saisie = sc.nextLine();
			if(!saisie.equals("q"))
			{
				int nombre = Integer.parseInt(saisie);
				somme+=nombre;
			}
			System.out.println("\tSomme totale : " + somme);
		}while(!saisie.equals("q"));

	}

}
