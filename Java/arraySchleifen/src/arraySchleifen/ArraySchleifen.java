package arraySchleifen;

public class ArraySchleifen {

	public static void main(String[] args) {
		int schleifenZaehler = 0;
		int summe = 0; 
		int kleinsterWert; // Um den minimal wert zu definieren
		int groessterWert; // Um den maximal wert zu definieren
		double durschnitt; // Um den durschnitt zu definieren
		
		// Anlegung und fuellung des Arrays
		int[] zahlenArray = {2 ,7, 11, 30, 41, 42, 100, 200, 33, 45, 111, 1000};
		
		
		kleinsterWert = zahlenArray[0]; // Minimal Wert auf ersten Wert des Arrays gesetzt 
		groessterWert = zahlenArray[0]; // Maximal Wert auf ersten Wert des Arrays gesetzt 
			
		// zahlenArray[0] = 333; // Aenderung des Inhalts an Position 0
				
		// Schleife durch alle Elemente des Arrays
		while (schleifenZaehler < zahlenArray.length) {
						
			// Summiert die Werte des Arrays
			summe = summe + zahlenArray[schleifenZaehler];
						
			// Der kleinste wert des Arrys wird definiert
			if(zahlenArray[schleifenZaehler] < kleinsterWert) {
				kleinsterWert = zahlenArray[schleifenZaehler];
			} 
						
			// Der groesste wert des Arrys wird definiert
			if(zahlenArray[schleifenZaehler] > groessterWert) {
				groessterWert = zahlenArray[schleifenZaehler];
			}
		
			//Ausgaben pro Wert im Array
			if (schleifenZaehler < (zahlenArray.length - 1)) {
					// Ausgabe der Summe bis X Position in Array
				System.out.println("Wert in Position " + schleifenZaehler + " ist " + zahlenArray[schleifenZaehler]); // Ausgabe Position und Wert
				System.out.println("Der aktuell groesste Wert ist: " + groessterWert + " und kleinster Wert ist: " + kleinsterWert); // Ausgabe aktueller groesster und kleinster wert
				System.out.println("Die aktuelle Summe ist: " + summe); // Ausgabe akutelle summe
					
			} else { 
					// Ausgabe der Gesamtsumme
				System.out.println("Letzte Position (" + schleifenZaehler + "): \nDie gesamt Summe des Arrays ist: " + summe);
				}
			
			// Position in Array zum naechsten Wert andern.
			schleifenZaehler++;
		}
		
		// Berechnung des durschnitts
		durschnitt = 1.0 * summe / zahlenArray.length; // "1.0 *" wird integriert um die Berechnung als Double durchzufuehren
		
		System.out.println("Die laenge des Arrays ist: " + zahlenArray.length); // Ausgabe laenge des Arrays
		System.out.println("Die summe des Arrays ist: " + summe); // Ausgabe Gesamtsumme des Arrays
		System.out.println("Kleinster Wert: " + kleinsterWert); // Ausgabe minimal Wert
		System.out.println("Groesster Wert: " + groessterWert); // Ausgabe maximal Wert
		System.out.println("Durschnitt des Arrays: " + durschnitt); // Ausgabe Durschnitt des Arrays
	}
}
