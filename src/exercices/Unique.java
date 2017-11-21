package exercices;

import java.util.ArrayList;

public class Unique 
{
	private int identifiant;
	private static int compteur=0;

	public Unique()
	{
		identifiant = compteur;
		System.out.println("Création : " + this);
		compteur++;
	}
	
	public String toString()
	{
		return "codeID:" + identifiant + "\tMax compteur:" + compteur;
	}
	
	
	public static void main(String[] args) 
	{
		//ArrayList<Unique> objets = new ArrayList<>();

		Unique obj1 = new Unique();
		Unique obj2 = new Unique();
		Unique obj3 = new Unique();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		new Unique();

	}

}
