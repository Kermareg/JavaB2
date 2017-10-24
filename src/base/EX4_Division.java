package base;

import java.util.Scanner;

public class EX4_Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// D�finition des variables utilis�es
		int nombre1, nombre2;
		nombre1=nombre2=0;

		System.out.print("Entrez le premier nombre : ");
		nombre1 = sc.nextInt();

		System.out.print("Entrez le second nombre : ");
		nombre2 = sc.nextInt();

		// Affichage et ex�cution de la division.
		// Comme on ne passe pas par une variable interm�diaire pour la division,
		// il faut utiliser des parenth�ses afin d'effectuer la division enti�re.
		// Essayez de r�aliser la division avec un diviseur = 0 :-)
		// Si pas de parenth�se, JAVA concat�ne nombre1 et nombre2 sous forme de String.
		System.out.println("La division de " + nombre1 + " et " + nombre2 + " vaut " + (nombre1/nombre2));

		// Fermeture du scanner.
		sc.close();
		
		System.exit(0);

	}

}
