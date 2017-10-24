package grille;

public class Point 
{
	private int posX;
	private int posY;
	
	public Point(int x, int y)
	{
		posX=x;
		posY=y;
	}
	
	public boolean isPosition(int x, int y)
	{
		return posX == x && posY == y;
	}
	
	public String toString()
	{
		return "(" + posX + ";" + posY + ")"; 
	}

}
