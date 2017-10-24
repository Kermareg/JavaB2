package base;

import java.util.Scanner;

public class HelloGuy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("Entrez votre prénom : "); 
		name = sc.nextLine();
		System.out.println("Hello " + name + " !");
		System.exit(0);
	}



}
