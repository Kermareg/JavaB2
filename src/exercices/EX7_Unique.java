package exercices;

public class EX7_Unique 
{
	private int identifiantUnique;
	private static int cpt=0;
	
	public EX7_Unique()
	{
		identifiantUnique = cpt++;
	}
	
	public String toString()
	{
		return "ID:" + identifiantUnique + "\tMax Count:" + cpt;
	}
	
	public int getIdentity()
	{
		return identifiantUnique;
	}
	
	public int getMaxNumber()
	{
		return identifiantUnique;
	}

	public static void main(String[] args) 
	{
		EX7_Unique premier = new EX7_Unique();
		EX7_Unique second = new EX7_Unique();
		
		System.out.println("Premier objet : " + premier);
		System.out.println("Second : " + second);
		
		for(int i=0;i<5;i++)
			System.out.println("Objet boucle : " + new EX7_Unique());
		
		System.out.println(premier);
		System.out.println("Second : " + second);
	}

}
