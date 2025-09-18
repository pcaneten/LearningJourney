public class Array2Schelifen {
	public static void main(String[] args) {
		// Anlegung und fuellung des Arrays
		int[] zahlenArray = {6 , 2, 5, 8, 4, 3, 1, 9, 7, 9};
		int elementMal2;
		int summeUngerade = 0;
		
		// Schleife durch alle Elemente des Arrays
		for (int schleifenZaehler = 0; schleifenZaehler < zahlenArray.length-1; schleifenZaehler++){
			
			/* 
			* Elemente an gerader Position mit 2 mul und ausgeben
			* und elemente bei ungerader Position summieren
			*/
			if(schleifenZaehler % 2 == 0){
				elementMal2 = zahlenArray[schleifenZaehler] *  2;
				System.out.println("schleifenzaehler: " + schleifenZaehler + 
					" Element (" + zahlenArray[schleifenZaehler] + ") mal 2 ist " + elementMal2);
			} else {
				summeUngerade += zahlenArray[schleifenZaehler];
				System.out.println("Summe ungerader Elemente bis Position " 
					+ schleifenZaehler + " ist: " + summeUngerade);
			}
		}
		System.out.println("Summe der ungerader elemente ist: " + summeUngerade);
	}
}