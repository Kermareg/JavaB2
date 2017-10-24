package grille;

import java.util.ArrayList;

public class Grille 
{
	private ArrayList<Point> points;
	private int hauteur, largeur;
	
	public Grille(int h, int l)
	{
		System.out.println("Création de la grille de " + h + "x" + l );
		hauteur = h;
		largeur = l;
		points = new ArrayList<>();
	}
	
	public String getGrid()
	{
		String retour = "";
		for(int i=0;i<hauteur; i++)
		{
			for(int j=0;j<largeur;j++)
			{
				retour += emplacementOccupe(i, j)?"X ":"_ ";
			}
			retour += "\n";
		}
		return retour;
	}
	
	private boolean emplacementOccupe(int x, int y)
	{
		for(Point lat : points)
		{
			if(lat.isPosition(x, y))
				return true;
		}
		return false;
	}
	
	public void displayGrid()
	{
		String grille = getGrid();
		System.out.println(grille);
	}
	
	public Grille addPoint(int x, int y) throws HorsPlageException
	{
		if(x < hauteur && y < largeur)
		{
			// On est bon, on ajoute un point dans la table
			Point p = new Point(x,y);
			System.out.println("Ajout d'un point " + p);
			points.add(p);
		}
		else
			throw new HorsPlageException("Hors plage.");
		return this;
	}
	
	public static void main(String[] args) throws HorsPlageException
	{
		Grille gr = new Grille(5, 10);
		gr.addPoint(0, 0);
		gr.displayGrid();
		gr.addPoint(0, 2);
		gr.displayGrid();
		gr.addPoint(4, 9);
		gr.displayGrid();
		System.exit(0);
	}

}
