public class ArrayNew {
	public static void main(String[] args){
		int arrayPos = 0;
		int arrayMax;
		int arrayMin;
		int arrayTotal = 0;
		double arrayAvg;
		int[] zahlenArray = {2 ,7, 11, 30, 41, 42, 100, 200, 33, 45, 111, 1000};
		
		arrayMax = zahlenArray[0];
		arrayMin = zahlenArray[0];
		
		while (arrayPos < zahlenArray.length) {
			if (arrayMax < zahlenArray[arrayPos]){
				arrayMax = zahlenArray[arrayPos];
			}
			if (arrayMin > zahlenArray[arrayPos]){
				arrayMin = zahlenArray[arrayPos];
			}
			arrayTotal += zahlenArray[arrayPos];
			
			System.out.print("Aktuelle Position: " + arrayPos + " Max Wert: " + arrayMax);
			System.out.print(" Min Wert: " + arrayMin + " aktuelle gesamtsumme: " + arrayTotal);
			System.out.format(" und durschnitt: %.2f%n", 1.0 * arrayTotal/(arrayPos+1));
						
			arrayPos++;
		}
				
		arrayAvg = 1.0 * arrayTotal/zahlenArray.length;
		
		System.out.println("Der Array hat " + zahlenArray.length + " Positionen"); 
		System.out.print("hat ein Min Wert von " + arrayMin);
		System.out.println(" und einen Max Wert von " + arrayMax);
		System.out.format("mit einen Durschnitt Wert von: %.2f%n", arrayAvg);
		System.out.println("und der Gesamt Wert des Arrays ist " + arrayTotal);		
	}
}