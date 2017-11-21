package exemples;

/**
 * Exemple d'héritage de la class Thread avec utilisation des
 * constructeurs de la superclass.
 * @author Bertrand
 *
 */
public class ThreadReecrit extends Thread
{
	private int compteur;
	
	/**
	 * Constructeur demandant un nom de thread
	 * @param threadName
	 */
	public ThreadReecrit(String threadName)
	{
		super(threadName);
		compteur = 0;
	}
	
	/**
	 * Constructeur prenant un nom et un compteur initial.
	 * @param threadName
	 * @param compteurInit
	 */
	public ThreadReecrit(String threadName, int compteurInit)
	{
		super(threadName);
		compteur = compteurInit;
	}
	
	/**
	 * Méthode provenant de Thread contenant le code "qui prend du temps".
	 */
	public void run()
	{
		try 
		{
			while(compteur < 100)
			{
				System.out.println(getName() + " " + compteur++);
				Thread.sleep((int)(Math.random()*200.0));
			}
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Lancement de 10 threads pour exécution simultanée.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{
			// Création d'un thread
			ThreadReecrit thread = new ThreadReecrit("Thread n°" + i);
			
			//Lancement de l'exécution
			thread.start();
		}
	}

}
