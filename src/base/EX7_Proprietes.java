package base;

public class EX7_Proprietes {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String proprietes = System.getProperties().toString();
		proprietes=proprietes.replaceAll(", ", "\n");
		System.out.println("Propri�t�s : " + proprietes);
		System.exit(0);
		}

}
