package exemples;

public class Personne 
{
	private String nom, prenom;
	
	public Personne()
	{
		
	}
	
	public Personne(String n, String p)
	{
		nom = n;
		prenom = p;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	public void affiche()
	{
		System.out.println("Personne : \n\tnom:" + nom + "\n\tprenom:" + prenom);
	}
	
	

}
