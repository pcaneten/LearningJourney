/* 
* Methode um eine ID-Card-Nummer anhand einer Pruefziffern Berechnung pruefen
* Pruefziffer ist die letzte Zahl.
* Pruefziffern Berechnung pruefung erfolgt mit folgenden Algorithmus:
* Schritt 1 mult. aller geraden Zahlen x 2
* Schritt 2 Addition der Quersummen aller Werte des Schrrits 1
* Schritt 3 Addition aller Zahlen im gerader stelle
* Schritt 4 Addition der Ergebnisse Schritt 2 & 3
* Schritt 5 Wenn Ergebniss schritt 4 nicht ohne Rest durch 10 teilbar, 
* 			Aufrundung auf die naechstgroessere durch 10 teilbare Zahl.
* Schritt 6 Ergebniss Schritt 5 - Schritt 4 mit PZ vergleichen.
*
* Zum testen koennen folgende ID-Card Nummern benutzt werden:
*	6 2 5 8 4 3 1 9 7 9 --> PZ = true
*	0 1 2 3 4 5 6 7 8 9 --> PZ = false
*	6 1 5 8 4 3 1 9 7 0 --> PZ = true
*
*/

import javax.swing.JOptionPane;

public class EingabePZ {

	public static void main(String[] args) {
		/* 
		* Schritt 1 --> Abfrage nach der ID-Card-Nummern und diese wird in einen Array eingefuelt. 
		*/
		String idCard;
		int[] idCardNumber = new int[10];
		
		// Abfrage der ID-Card-Nummer
		idCard = JOptionPane.showInputDialog(
			"Geben sie die ID-Card-Nummern ein: " );
		// Ueberprueft die länge der eingabe
		while (idCard.length() != 10){
			idCard = JOptionPane.showInputDialog(
				"Die eingebene ID-Card-Nummern hat die falsche länge, soll 10 Zahlen haben. \n\nBitte neu eingeben:" ); 
		}
		
		// Einfullung der ID-Card-Nummern im Array idCardNumber[]
		for (int i = 0; i < idCard.length(); i++){
			idCardNumber[i] = idCard.charAt(i) - 48; 
			/* Da charAt in ASCII konvertiert mussen wir minus 0 also um 48 in ASCII reduzieren 
			(ASCII zu Dezimal --> 48 = 0 , 49 = 1, 50 = 2, 51 = 3, usw.) */
			if (idCardNumber[i] < 0 || idCardNumber[i] > 9) {
				System.out.println("Üngültige zeichen wurden eingetragen. Programm muss neu gestartet werden");
				System.exit(0);
			}
		}
		
		/* 
		* Schritt 2 --> Ueberpruefung der PZ und die gültigkeit der ID-Card-Nummer
		*/
		
		int gesamtsumme = 0;
		int pruefziffer = 0;
						
		// For loop für die Berechnungen fuer jede Nummer
		for(int i = 0; i < idCardNumber.length - 1; i++) {
			// Unterschied zwischen geraden und ungareden positionen
			if(i % 2 == 0) {
				// Berechnung für der quersummen der Element-Werte in gerader stelle:
				// wenn Element-Wert x 2 kleiner als 9 ist: quersumme = Element-Wert x 2
				// wenn groeser als 9 ist die quersumme das Element-Wert x 2 minus 9
				if(idCardNumber[i] * 2 < 9) {
					gesamtsumme += idCardNumber[i] * 2;
				} else {					
					gesamtsumme += idCardNumber[i] * 2 - 9; 
				}
			} else {
				// Summierung der Element-Werte in ungerader stelle
				gesamtsumme += idCardNumber[i]; 
			}
		}
		// Berechnung der Pruefziffer wenn nicht ohne rest durch 10 teilbar.
		if (gesamtsumme % 10 != 0) {
			int temp1 = gesamtsumme % 10;
			int temp2 = gesamtsumme - temp1 + 10;
			pruefziffer = temp2 - gesamtsumme; 
		} 
		
		/* 
		* Schritt 3 --> Ausgabe
		*/
		
		// Ausgabe als pop up fenster		
		// JOptionPane.showMessageDialog(null, "Pruefziffer der Karte: " + idCard + " ist: " + (pruefziffer == idCardNumber[idCardNumber.length - 1]));
		
		// Ausgabe in cmd
		
		System.out.println("Pruefziffer der Karte: " + idCard + " ist:\t" + (pruefziffer == idCardNumber[idCardNumber.length - 1])); 
	}
}