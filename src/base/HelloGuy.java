package base;

import java.util.Scanner;

public class HelloGuy {

	public static void main(String[] args) {
		System.out.println("Affichage des arguments re�us (" + args.length + ")" );
		
		for(int i=0 ; i< args.length ; i++)
		{
			System.out.println("Argument � la position " + i + " : " + args[i]);
		}
		
		
		for (String temp : args) {
			System.out.println(temp);
			temp = "5";
		}
		
		
		/*Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("Entrez votre pr�nom : "); 
		name = sc.nextLine();
		System.out.println("Hello " + name + " !");*/
		System.exit(0);
	}



}
