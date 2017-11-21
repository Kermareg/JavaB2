package heritage.marchandise;

/**
 * Classe de base (squelette) pour une cargaison.
 * @author Bertrand
 * @version 1
 *
 */
public abstract class Cargaison 
{
	/**
	 * Distance devant �tre parcourue par la cargaison (quelle que soit sont type)
	 */
	protected int distance=0;
	
	/**
	 * Construction d'une nouvelle cargaison devant se d�placer vers une distance sp�cifique.
	 * @param distance
	 */
	public Cargaison(int distance)
	{
		System.out.println("Cr�ation d'une cargaison pour " + distance + "km.");
		this.distance=distance;
	}
	
	/**
	 * Ajoute une marchandise � la cargaison en cours. 
	 * Il peut �tre n�cessaire de recalculer le cout pour emp�cher l'ajout ?
	 * @param m marhcandise � ajouter.
	 */
	abstract public boolean ajouter(Marchandise m);
	
	/**
	 * Calcul du cout total de la cargaison en fonction de son type de trnasport.
	 * @return le cout de la cargaison.
	 */
	abstract public int cout();

}
