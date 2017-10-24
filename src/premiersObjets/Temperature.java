package premiersObjets;

/**
 * Stockage d'une température avec passerelle entre celsius et farenheit
 * @author Bertrand
 * @version 1
 *
 */
public class Temperature 
{
	private double temperature;
	
	/**
	 * Constructeur par défaut
	 */
	public Temperature()
	{
		temperature=0;
	}
	
	/**
	 * Surcharge du constructeur par défaut prennant une température en celsius de base
	 * @param celsius - la température à initialiser
	 */
	public Temperature(int celsius)
	{
		setCelsius(celsius);
	}
	
	/**
	 * Méthode de convenance pour faciliter l'affichage.
	 */
	public String toString()
	{
		return "°C\t" + getCelsius() + "\n°F\t" + getFarenheit();
	}
	
	/**
	 * Mise à jour de la température en celsius
	 * @param temperature
	 */
	public void setCelsius(double temperature)
	{
		this.temperature=temperature;
	}
	
	
	/**
	 * Mise à jour de la température en farenheit.
	 * @param temperature
	 */
	public void setFarenheit(double temperature)
	{
		this.temperature = (temperature-32.0)/1.8;
	}
	
	/**
	 * Récupération de la température en farenheit
	 * @return
	 */
	public double getFarenheit() {
		double farenheit = 1.8 * temperature + 32;
		return farenheit;
	}

	/**
	 * Récupération de la température en celsius
	 * @return
	 */
	public double getCelsius() {
		return temperature;
	}

	public static void main(String[] args) 
	{
		System.out.println("Températures");
		
		Temperature glace = new Temperature();
		Temperature ebulition = new Temperature(100);
		glace.setFarenheit(32.0);
		
		System.out.println("Température d'ébulition de l'eau : ");
		System.out.println(ebulition);
		System.out.println("Température de solidification de l'eau : ");
		System.out.println(glace);
		
		System.exit(0);
		
	}
	

}
