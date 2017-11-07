package base;

import java.util.Scanner;

public class EX8_TestNombre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le premier nombre : ");
		int nbr1 = sc.nextInt();
		System.out.println("Entrez le second nombre : ");
		int nbr2 = sc.nextInt();
		
		checkDiff(nbr1,nbr2);
		checkLT(nbr1,nbr2);
		checkGT(nbr1,nbr2);
		checkGTE(nbr1,nbr2);
		checkLTE(nbr1, nbr2);
		
		sc.close();
		System.exit(0);

	}

	private static void checkGT(int nbr1, int nbr2) {
		if(nbr1 > nbr2)
			System.out.println(nbr1 + ">" + nbr2);
		
	}

	private static void checkGTE(int nbr1, int nbr2) {
		if(nbr1 >= nbr2)
			System.out.println(nbr1 + ">=" + nbr2);
		
	}

	private static void checkDiff(int nbr1, int nbr2) {
		if(nbr1 == nbr2)
			System.out.println(nbr1 + "==" + nbr2);
		else
			System.out.println(nbr1 + "!=" + nbr2);
		
	}

	private static void checkLT(int nbr1, int nbr2) {
		if(nbr1 < nbr2)
			System.out.println(nbr1 + "<" + nbr2);
		
	}

	private static void checkLTE(int nbr1, int nbr2) {
		if(nbr1 <= nbr2)
			System.out.println(nbr1 + "<=" + nbr2);
		
	}

}
