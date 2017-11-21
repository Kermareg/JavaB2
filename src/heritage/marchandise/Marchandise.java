package heritage.marchandise;

/**
 * Représentation d'une marchandise
 * @author Bertrand
 * @version 1 
 *
 */
public class Marchandise 
{
	private int poids;
	private int volume;

	/**
	 * Construction d'une machandise
	 * @param poids
	 * @param volume
	 */
	public Marchandise(int poids, int volume)
	{
		this.poids=poids;
		this.volume=volume;
	}
	
	/**
	 * Retourne le poids de la marchandise désignée.
	 * @return le poids
	 */
	public int getPoids()
	{
		return poids;
	}
	
	/**
	 * Retourne le volume de la marchandise désignée.
	 * @return le volume
	 */
	public int getVolume()
	{
		return volume;
	}

}
