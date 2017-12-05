package exemples;

import java.util.Hashtable;



public class TestHachTables {
	public static void main(String[] args) {
		Hashtable<String, Etudiant> etudiants = new Hashtable<>();
		
		Etudiant e1, e2, e3;
		e1 = new Etudiant("Michaux", "Bertrand");
		e2 = new Etudiant("Gokalp", "Aylin");
		e3 = new Etudiant("Daspremont", "Aloïs");

		etudiants.put("Michaux", e1);
		etudiants.put("etudiant", e2);
		etudiants.put("Daspremont", e3);
		
		System.out.println("Etudiant à la clef Gokalp : " + etudiants.get("etudiant"));
		
	}
}
