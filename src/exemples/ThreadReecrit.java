package exemples;

public class ThreadReecrit extends Thread
{
	private int compteur;
	//private String name;
	public ThreadReecrit(String threadName)
	{
		super(threadName);
		//name=threadName;
		compteur = 0;
	}
	

	public ThreadReecrit(String threadName, int compteurInit)
	{
		//name=threadName;
		super(threadName);
		compteur = compteurInit;
	}
	
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
	
	
	
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{
			ThreadReecrit thread = new ThreadReecrit("Thread n°" + i);
			thread.start();
		}
	}

}
