package heritage.marchandise;

/**
 * 
 * @author Bertrand
 * @version 1
 *
 */
public class Aerienne extends Cargaison {

	/**
	 * Constructeur par défaut qui fait appel au constructeur supérieur
	 * @param distance
	 */
	public Aerienne(int distance) {
		super(distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ajouter(Marchandise m) {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public int cout() {
		// TODO Auto-generated method stub
		return 0;
	}

}
