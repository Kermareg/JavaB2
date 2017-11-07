package exemples;

import java.util.ArrayList;

import javax.swing.JFrame;

public class TestEtudiant {

	public static void main(String[] args) {
		Personne p = new Personne("Michaux","Bertrand");
		//p.affiche();
		Etudiant e1 = new Etudiant("Tartampion", "Toto", "la123456");
		ErasmusEtudiant e2 = new ErasmusEtudiant("Jobs", "Steve", "kt123456", "MIT");
		//e1.affiche();
		//e2.affiche();
		
		ArrayList<Personne> personnes = new ArrayList<>();
		personnes.add(p);
		personnes.add(e1);
		personnes.add(e2);
		personnes.add(new LeonardoEtudiant("Tata", "Titi"));
		
		
		for (Personne temp : personnes) 
		{
			//temp.affiche();
			if(temp.getClass().equals(ErasmusEtudiant.class))
			{
				System.out.println("université d'origine : ");
				((ErasmusEtudiant)temp).afficheUniversiteOrigine();
			}
			temp.affiche();

			
		}
		
		System.exit(0);
		
		

	}

}
