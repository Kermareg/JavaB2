package heritage.marchandise;

/**
 * Une cargaison aérienne expresse étant une cargaison, il ne faut ré-écrire que la méthode de calcul du cout.
 * @author Bertrand
 * @version 1
 *
 */
public class AerienneExpress extends Aerienne 
{

	/**
	 * Constructeur par défaut qui fait appel au constructeur supérieur
	 * @param distance
	 */
	public AerienneExpress(int distance) 
	{
		super(distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cout() 
	{
		return 2*super.cout();
	}
	
	

}
