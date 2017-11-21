package heritage.enseignant;

public class EnseignantExterne extends Enseignant
{

	public EnseignantExterne(String nom, int heures) {
		super(nom, heures);
	}

	@Override
	public int retribution() 
	{
		return complementaire() * SALAIRE;
	}

	@Override
	public int complementaire() 
	{
		return heures;
	}
	
	
	

}
