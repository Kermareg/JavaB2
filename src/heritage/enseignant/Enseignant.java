package heritage.enseignant;

public class Enseignant 
{
	protected String nom;
	protected int heures;
	
	static final int SEUIL = 192;
	static final int SALAIRE = 35;
	
	public Enseignant(String nom, int heures)
	{
		this.heures=heures;
		this.nom=nom;
	}
	
	public int retribution()
	{
		return complementaire() * SALAIRE;
	}
	
	public int complementaire()
	{
		int retour = 0;
		if(heures > SEUIL)
			retour = heures-SEUIL;
		return retour;			
	}

	@Override
	public String toString() {
		return "Enseignant [nom=" + nom + ", heures=" + heures + "]" + " retrib = " + retribution();
	}
	
	

}
