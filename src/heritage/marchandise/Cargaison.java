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
	 * Distance devant être parcourue par la cargaison (quelle que soit sont type)
	 */
	protected int distance=0;
	
	/**
	 * Construction d'une nouvelle cargaison devant se déplacer vers une distance spécifique.
	 * @param distance
	 */
	public Cargaison(int distance)
	{
		System.out.println("Création d'une cargaison pour " + distance + "km.");
		this.distance=distance;
	}
	
	/**
	 * Ajoute une marchandise à la cargaison en cours. 
	 * Il peut être nécessaire de recalculer le cout pour empêcher l'ajout ?
	 * @param m marhcandise à ajouter.
	 */
	abstract public boolean ajouter(Marchandise m);
	
	/**
	 * Calcul du cout total de la cargaison en fonction de son type de trnasport.
	 * @return le cout de la cargaison.
	 */
	abstract public int cout();

}
