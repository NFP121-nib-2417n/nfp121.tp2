package Question1;


public class FahrenheitCelsius {

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {	
		for(int i=0 ; i<args.length; i++){
                    	int fahrenheit = Integer.parseInt(args[i]);
                    	double celsius = fahrenheitEnCelsius(fahrenheit);
                    	System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
                    	
                }																			
	}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static double fahrenheitEnCelsius(int f) {
        	f -= 32;
                double celsiusDegree = (5 * (double)f)/9;
                celsiusDegree *= 10;
                int r = (int)celsiusDegree;
                celsiusDegree = ((double)r)/10;                
		return celsiusDegree;                                           // à compléter en remplaçant ce return 0.F par la fonction
                                        					// de conversion
	}

}





















