package exemples;

import java.util.ArrayList;


public class TestListes 
{
	public static void main(String[] args) {
		ArrayList<Etudiant> etudiants = new ArrayList<>();
		Etudiant e1 = new Etudiant("Michaux","Bertrand");
		
		etudiants.add(e1);
		System.out.println("Taille du tableau : " + etudiants.size());
		System.out.println("Etudiant à la position 0 : " + etudiants.get(0));
		
		boolean retour;
		
		//retour = etudiants.remove(e1);
		System.out.println("Taille du tableau : " + etudiants.size());
		//System.out.println(retour);
		
		Etudiant e2 = new Etudiant("Goossens", "Cédric");
		etudiants.add(0, e2);
		etudiants.add(1,new Etudiant("Zandarin","Nicolas"));
		//retour = etudiants.remove(e2);
		//System.out.println(retour);
		
		for (Etudiant etudiant : etudiants) {
			System.out.println(etudiant);
		}
		
		System.out.println("Position de Bertrand : " + etudiants.indexOf(e1));
	}

}
