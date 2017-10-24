package base;

public class EX7_Proprietes {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String proprietes = System.getProperties().toString();
		proprietes=proprietes.replaceAll(", ", "\n");
		System.out.println("Propriétés : " + proprietes);
		System.exit(0);
		}

}
