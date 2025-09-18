/*
 * Ermittlung der Pruefziffer eines Barcodes:
 * 
 * 	Ziffern in gerader Position werden addiert.
 * 	Ziffern in ungerader Position werden mit 3 multipliziert und dann addiert.
 * 	Pruefziffer ist die Differenz der Summe zum naechstkleineren Vielfachen von 10 (modulo 10).
 * 	
 * 	Also: Pruefziffer = (Summe gerader Ziffern + 3*Summe ungerader Ziffern)%10
 * 	z.B. Summe = 85, dann 85%10 = 5, Pruefziffer = 5.
 *
 */

package ermittlePruefzifer;

import javax.swing.JOptionPane;

public class ErmittlePruefziffer {

	public static void main(String[] args) {
		int arrayGroesse = 9;
		int[] barcodeArray = new int[arrayGroesse];
		int pruefziffer = 0;
		
		String barcode = JOptionPane.showInputDialog(
				"Geben Sie den Barcode ein:");
		if (barcode == null) {
			System.out.println("Programm wurde unterbrochen");
			System.exit(0);
		}
		// Ueberprueft die laenge der eingabe
		if (barcode.length() != 10) {
			System.out.println("Barcode ist inkorrekt. Barcode soll 10 Ziffern haben.");
		} else {
			// Eingabe der ersten 9 Ziffern in dem barcodeArray mit einer for schleife.
			for(int i = 0; i < arrayGroesse; i++) {
				// Umwandlung von char in int. Char wird in Nummern des ASCII codes angezeigt
				// wo die zahlen '0' bis '9' sich mit den Ziffern 48 bis 57 identifizieren. Also
				// mit ein einfachen -48 oder -'0', wir die int von 0 bis 9 bekommen.
				barcodeArray[i] = barcode.charAt(i) - '0';
				// Uberprueft ob Sonderzeichen oder Buchstaben eingetragen wurden.
				if(barcodeArray[i] > 0 && barcodeArray[i] < 10) {
					if(i%2==0) {
						pruefziffer += barcodeArray[i]; //grade Ziffern werden 1 zu 1 addiert.
					} else {
						pruefziffer += (barcodeArray[i]*3); // ungerade Zifern vor der addierung mit 3 multipliziert.
					}
				} else {
					// Bei ungueltiger eingabe, wird der programm beendet.
					System.out.println("Ungueltige Zeichen eingetragen, Programm muss neu Gestarted werden");
					System.exit(0);
				}
			}
			// Pruefziffer ist der rest der adderiung der Werte modulo 10
			pruefziffer = pruefziffer%10;
			// Pruefziffer wird der eingabe vergleicht (letzter nummer).
			boolean pzVergleich = (pruefziffer == (barcode.charAt(9) - '0'));
			
			//Ausgabe des barcodes, die kalkulierte pruefziffer und ob die eingabe richtig oder falsch ist.
			System.out.println("Der Barcode ist: " + barcode);
			System.out.println("Die pruefziffer ist: "+ pruefziffer);
			if (pzVergleich) {
				System.out.println("Der eigegebene Barcode ist korrekt.");
			} else {
			System.out.println("Der eigegebene Barcode ist falsch.");
			}
		}
	}

}
