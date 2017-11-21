package heritage.marchandise;

/**
 * Une cargaison a�rienne expresse �tant une cargaison, il ne faut r�-�crire que la m�thode de calcul du cout.
 * @author Bertrand
 * @version 1
 *
 */
public class AerienneExpress extends Aerienne 
{

	/**
	 * Constructeur par d�faut qui fait appel au constructeur sup�rieur
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
