package base;

import java.util.Scanner;

public class Somme {

	public static void main(String[] args) {
		int nombre1, nombre2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le premier nombre : ");
		nombre1 = sc.nextInt();
		System.out.print("Entrez le second nombre : ");
		nombre2 = sc.nextInt();
		System.out.println("Somme = " + (nombre1 + nombre2));
		System.exit(0);
	}

}
