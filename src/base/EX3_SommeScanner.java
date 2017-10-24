package base;

import java.util.Scanner;

public class EX3_SommeScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// D�finition des variables utilis�es
		int nombre1, nombre2;
		nombre1=nombre2=0;
		
		System.out.print("Entrez le premier nombre : ");
		nombre1 = sc.nextInt();
		
		System.out.print("Entrez le second nombre : ");
		nombre2 = sc.nextInt();
		
		// Affichage et ex�cution de la somme.
		// Comme on ne passe pas par une variable interm�diaire pour la somme,
		// il faut utiliser des parenth�ses afin d'effectuer la somme enti�re.
		// Si pas de parenth�se, JAVA concat�ne nombre1 et nombre2 sous forme de String.
		System.out.println("La somme de " + nombre1 + " et " + nombre2 + " vaut " + (nombre1+nombre2));
		
		// Fermeture du scanner.
		sc.close();
		System.exit(0);

	}

}
