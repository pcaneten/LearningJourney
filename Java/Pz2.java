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
*/

import javax.swing.JOptionPane;

public class Pz2 {
	public static void main(String[] args){
		/* 
		* Abfrage nach der ID-Card-Nummern und diese wird in einen Array eingefuelt. 
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
		}
		
		
		int zifferMal2 = 0; // variable fuer schrrit 1 
		int zwischensummeS2 = 0; // variable fuer die quersummen jedes wertes
		int ergebnisSchritt2 = 0;
		int ergebnisSchritt3 = 0;
		int ergebnisSchritt4 = 0;
		int ergebnisSchritt5 = 0;
		int ergebnisSchritt6 = 0;
				
		System.out.println();
		//Schleife durch Array ohne letzter Ziffer da Pruefziffer.
		for (int i = 0; i < idCardNumber.length - 1; i++){
			// If statement um gerade Ziffer zu identifizieren
			if ( i % 2 == 0) {
				//Jede Ziffer multiplizieren
				zifferMal2 = idCardNumber[i] * 2; 
				// Ausgabe zifferMal2 pro Array Position
				System.out.print("Ziffer in Position " + i + " ist:\t" + idCardNumber[i] 
						+ "\tund x2 ist:\t" + zifferMal2);
				
				/* If statement für quersummen, bei Ziffern 0 bis 9, wenn zifferMal2 > 10+
				* Quersumme ist = zifferMal2 - 9
				*/
				if (zifferMal2 < 9) {
					zwischensummeS2 = zifferMal2;
				} else {
					zwischensummeS2 = zifferMal2 - 9;
				}
				// Ausgabe Quersumme pro gerader Position.
				System.out.println("\tDie Quersumme:\t " + zwischensummeS2);
				// Addierung der zwischensummenS2
				ergebnisSchritt2 += zwischensummeS2;
			} else {
				// Ausgabe der Ziffern in ungerader Position
				System.out.println("Ziffer in Position " + i + " ist:\t" + idCardNumber[i]);
				// Addition der Ziffern in ungerader Position
				ergebnisSchritt3 += idCardNumber[i];
			}
		}
		// Addition der Ergebnisse Schritt 2 & 3
		ergebnisSchritt4 = ergebnisSchritt2 + ergebnisSchritt3;
		
		// If statement fuer aufrundung wenn ergebnisSchritt4 % 10 groesser als 0 ist
		if (ergebnisSchritt4 % 10 != 0) {
			// Aufrundung auf den naechstgroessere dezimal Wert
			int temp1 = ergebnisSchritt4 % 10;
			ergebnisSchritt5 = ergebnisSchritt4 - temp1 + 10;
			ergebnisSchritt6 = ergebnisSchritt4 - ergebnisSchritt5;
		} 		
		
		ergebnisSchritt6 = ergebnisSchritt5 - ergebnisSchritt4;
		
		// Ausgabe Ergebniss Schritt 2
		System.out.println("\n(Schritt 2)\tAddition der Quersummen:\t\t\t" + ergebnisSchritt2);
		// Ausgabe Ergebniss Schritt 3
		System.out.println("(Schritt 3)\tAddition der ungerader Ziffern:\t\t\t" + ergebnisSchritt3);
		// Ausgabe Ergebniss Schritt 4
		System.out.println("(Schritt 4)\tAddition Ergebniss der Schritte 2 und 3:\t" + ergebnisSchritt4);
		// Ausgabe Ergebniss Schritt 5
		System.out.println("(Schritt 5)\tAufrundung des Ergebniss Schritt 4 auf "
			+ "\n\t\tnächstgrößere durch 10 teilbare Zahl, wenn "
			+ "\n\t\tErgebniss nicht ohne Rest durch 10 teilbar:\t" + ergebnisSchritt5);
		// Ausgabe Ergebniss Schritt 6
		System.out.println("(Schritt 6)\tPruefziffer Ergebniss:\t\t\t\t" + ergebnisSchritt6);
		// Ueberpruefund ob Ergebniss Schritt 6 gleich letzter Ziffer.
		System.out.println("\nIst Pruefziffer gültig?\t\t" + (ergebnisSchritt6 == idCardNumber[idCardNumber.length - 1]));
	}
}