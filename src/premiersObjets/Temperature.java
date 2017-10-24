package premiersObjets;

/**
 * Stockage d'une temp�rature avec passerelle entre celsius et farenheit
 * @author Bertrand
 * @version 1
 *
 */
public class Temperature 
{
	private double temperature;
	
	/**
	 * Constructeur par d�faut
	 */
	public Temperature()
	{
		temperature=0;
	}
	
	/**
	 * Surcharge du constructeur par d�faut prennant une temp�rature en celsius de base
	 * @param celsius - la temp�rature � initialiser
	 */
	public Temperature(int celsius)
	{
		setCelsius(celsius);
	}
	
	/**
	 * M�thode de convenance pour faciliter l'affichage.
	 */
	public String toString()
	{
		return "�C\t" + getCelsius() + "\n�F\t" + getFarenheit();
	}
	
	/**
	 * Mise � jour de la temp�rature en celsius
	 * @param temperature
	 */
	public void setCelsius(double temperature)
	{
		this.temperature=temperature;
	}
	
	
	/**
	 * Mise � jour de la temp�rature en farenheit.
	 * @param temperature
	 */
	public void setFarenheit(double temperature)
	{
		this.temperature = (temperature-32.0)/1.8;
	}
	
	/**
	 * R�cup�ration de la temp�rature en farenheit
	 * @return
	 */
	public double getFarenheit() {
		double farenheit = 1.8 * temperature + 32;
		return farenheit;
	}

	/**
	 * R�cup�ration de la temp�rature en celsius
	 * @return
	 */
	public double getCelsius() {
		return temperature;
	}

	public static void main(String[] args) 
	{
		System.out.println("Temp�ratures");
		
		Temperature glace = new Temperature();
		Temperature ebulition = new Temperature(100);
		glace.setFarenheit(32.0);
		
		System.out.println("Temp�rature d'�bulition de l'eau : ");
		System.out.println(ebulition);
		System.out.println("Temp�rature de solidification de l'eau : ");
		System.out.println(glace);
		
		System.exit(0);
		
	}
	

}
