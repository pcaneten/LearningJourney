/*
* Noten berechnung.
* 2 Hauptteile:	AP1(Generell) und AP2(Berfubezogen)
*	AP1 macht ein 20% der gesamt Note.
*	AP2 wird in 3 (AP2.1) Schriftliche Pruefungen + (AP 2.2) Projekt Arbeit (Doku+Pres) geteilt 
*	AP2.1 -- Die 3 Schriftliche Pruefungen sind je 10% der gesamt Note
*	AP2.2 -- Die Projekt Arbeit ist 50%, who 25% Dokumentation und 25% Presentation gilt
*
*		Bestanten ist wenn:
*		AP1 + AP2 > 50%
*		AP2 > 50%
*		AP2 min 3 Pruefungen ueber 50%	
*		AP2 keine unter 30%
*		Wenn Werte AP2 nicht erreicht werden oder AP2.1 mehr als 1 Pruefung unter 50% hat, 
*		ist EINE Ergaenzungspruefung moeglich.
*		Die Ergaenzungspruefung bezieht sich auf die Schriftliche Pruefungen und
*		wird wie folgt berechnet:
*		Eine der Schriftlichen Pruefungen gilt zu 2/3 und Ergaenzungspruefung 1/3
*		AP2.1 wenn 2 unter 30% => nicht bestanten
*
*/


import javax.swing.JOptionPane;

public class Notenrechner{
	
	public static void main(String[] args){
		
		String eingabe;
		int AP1 = 0;
		int AP2BerfuSchrif1 = 0;
		int AP2BerfuSchrif2 = 0;
		int AP2BerfuSchrif3 = 0;
		int AP2ProjektDoku = 0;
		int AP2ProjektPraes = 0;
		double AP2Ergaenzung = 0.0; 
		double AP2Gesamt = 0.0;
		double MaxAP2Er = 0.0;
		int AP2ErgaenzungCounter = 0;
		int AP2SchriftlichCounter = 0;
		boolean bestanden = false;
		
		//AP1
		
		// Abfrage der AP1 Note
		eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Noten % der AP1 ein ");
		AP1 =  Integer.parseInt(eingabe);
		
		//AP 2
			
		// AP2.1 -- Schriftliche Pruefungen
		
		// Abfrage der Note AP2.1 Pruefung 1
		eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Berfubezogene Schriftliche Prüfung 1 ein: ");
		AP2BerfuSchrif1 =  Integer.parseInt(eingabe);
			//Wenn Wert über 50% wird direkt in gesamt Note mal 0.1 eingetragen
			if (AP2BerfuSchrif1 >= 50) {
				AP2Gesamt += 1.0 * 0.1 * AP2BerfuSchrif1;
				//System.out.println("AP2BerfuSchrif1:\t" + AP2BerfuSchrif1 + "\tAP2Gesamt\t" + AP2Gesamt);
			//Wenn Wert unter 30% ist Ergaenzungpruefung erforderlich. 
			} else if (AP2BerfuSchrif1 < 30){
				AP2ErgaenzungCounter++;
				AP2SchriftlichCounter++;
				// Note wird mit wert zu 2/3 zur Ergaenzungsnote eingetragen
				 MaxAP2Er = AP2BerfuSchrif1;
				//System.out.println("Ergaenzungpruefung notwendig" + AP2Ergaenzung);
			//Wenn Wert zwischen 30% und 50% in gesamt Note eingetragen und counter fuer Ergeanzung eingetragen
			} else {
				AP2SchriftlichCounter++;
				MaxAP2Er = AP2BerfuSchrif1;
				//System.out.println("AP2BerfuSchrif1:\t" + AP2BerfuSchrif1 + "\tAP2Gesamt\t" + AP2Gesamt + "\tAP2SchriftlichCounter\t" + AP2SchriftlichCounter);
			}
		
		// Abfrage der Note AP2.1 Pruefung 2
		eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Berfubezogene Schriftliche Prüfung 2 ein: ");
		AP2BerfuSchrif2 = Integer.parseInt(eingabe);
			//Wenn Wert über 50% wird direkt in gesamt Note mal 0.1 eingetragen
			if (AP2BerfuSchrif2 >= 50) {
				AP2Gesamt += 1.0 * 0.1 * AP2BerfuSchrif2;
				//System.out.println("AP2BerfuSchrif2:\t" + AP2BerfuSchrif2 + "\tAP2Gesamt\t" + AP2Gesamt);
			// Wenn Wert unter 30% wird geprueft ob es bereits eine Note unter 30 gibt
			} else if (AP2BerfuSchrif2 < 30){
				if (AP2ErgaenzungCounter == 0 && AP2SchriftlichCounter != 1){
					AP2ErgaenzungCounter++;
					AP2SchriftlichCounter++;
					// Note wird mit wert zu 2/3 zur Ergaenzungsnote eingetragen
					MaxAP2Er += AP2BerfuSchrif2;
					//System.out.println("Ergaenzungpruefung notwendig" + AP2Ergaenzung);
			// Wenn bereits ein Wert unter 30 im Schriftlichen bereich eingetragen wurde ist automatisch nicht bestanden.
				} else {
				bestanden = false;
				//System.out.println("Nicht bestanden");
				}
			//Wenn Wert zwischen 30% und 50% in gesamt Note eingetragen und counter fuer Ergeanzung eingetragen
			} else {
				AP2SchriftlichCounter++;
				if (AP2BerfuSchrif2 > AP2BerfuSchrif1){
					MaxAP2Er = AP2BerfuSchrif2;
				}				
				//System.out.println("AP2BerfuSchrif2:\t" + AP2BerfuSchrif2 + "\tAP2Gesamt\t" + AP2Gesamt + "\tAP2SchriftlichCounter\t" + AP2SchriftlichCounter);
			}
					
		// Abfrage der Note AP2.1 Pruefung 3
		eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Berfubezogene Schriftliche Prüfung 2 ein: ");
		AP2BerfuSchrif3 = Integer.parseInt(eingabe);
			//Wenn Wert über 50% wird direkt in gesamt Note mal 0.1 eingetragen
			if (AP2BerfuSchrif3 >= 50) {
				AP2Gesamt += 0.1 * AP2BerfuSchrif3;
				//System.out.println("AP2BerfuSchrif3:\t" + AP2BerfuSchrif3 + "\tAP2Gesamt\t" + AP2Gesamt);
			// Wenn Wert unter 30% wird geprueft ob es bereits eine Note unter 30 gibt
			} else if (AP2BerfuSchrif3 <= 30){
				if (AP2ErgaenzungCounter == 0 && AP2SchriftlichCounter != 1){
					AP2ErgaenzungCounter++;
					AP2SchriftlichCounter++;
					// Note wird mit wert zu 2/3 zur Ergaenzungsnote eingetragen
					MaxAP2Er = AP2BerfuSchrif3;
					//System.out.println("Ergaenzungpruefung notwendig" + AP2Ergaenzung);
			// Wenn bereits ein Wert unter 30 im Schriftlichen bereich eingetragen wurde ist automatisch nicht bestanden.
				} else {
				bestanden = false;
				//System.out.println("Nicht bestanden");
				}
			// Wenn bereits 2 Pruefungen unter 50% eingetragen wurde, ist automatisch nicht bestanten.
			} else if (AP2SchriftlichCounter == 2){
				bestanden = false;
				//System.out.println("Nicht bestanden");
			//Wenn Wert zwischen 30% und 50% in gesamt Note eingetragen und counter fuer Ergeanzung eingetragen
			} else {
				AP2SchriftlichCounter++;
				if (AP2BerfuSchrif3 > MaxAP2Er){
				MaxAP2Er = AP2BerfuSchrif3;
				}
				//System.out.println("AP2BerfuSchrif3:\t" + AP2BerfuSchrif3 + "\tAP2Gesamt\t" + AP2Gesamt + "\tAP2SchriftlichCounter\t" + AP2SchriftlichCounter);
			}
		
		// AP2.2 -- Projektarbeit
		
		// Abfrage der Note AP2.2 Dokumentation
		eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Dokumentation der Projektarbeit ein: ");
		AP2ProjektDoku = Integer.parseInt(eingabe);
		// Wird direkt in gesamt Note mal 0.25 eingetragen
		AP2Gesamt += 0.25 * AP2ProjektDoku;
		//System.out.println("AP2ProjektDoku\t" + AP2ProjektDoku + "\tAP2Gesamt\t" + AP2Gesamt);
		
		// Abfrage der Note AP2.2 Praesentation
		eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Dokumentation der Präsentation ein: ");
		AP2ProjektPraes = 1.0 * Integer.parseInt(eingabe);
			// Wenn note Doku + Praes unter 30% automatisch nicht bestanden.
			if ((AP2ProjektPraes + AP2ProjektDoku) < 30) {
				bestanden = false;
				//System.out.println("Nicht bestanden");
			}
		// Wird in der gesamt Note mal 0.25 eingetragen
		AP2Gesamt += 0.25 * AP2ProjektPraes;
		//System.out.println("AP2ProjektPraes\t" + AP2ProjektPraes + "\tAP2Gesamt\t" + AP2Gesamt);
		
		// Ergaenzungpruefung
		
		// Wenn 1 Schriftliche Pruefung unter 30% war ist eingabe Note Ergaenzungpruefung erforderlich
		if (AP2ErgaenzungCounter == 1) {
			eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Note % der Ergänzungsprüfung ein: ");
			//Note wird mit mit 1/3 in Erganzung eingetragen
			AP2Ergaenzung = (1.0*(Integer.parseInt(eingabe)))/3 + (MaxAP2Er*2)/3;
		// Wenn 2 Schriftliche Pruefungen unter 50% waren ist eingabe Note Ergaenzungpruefung erforderlich
		} else if (AP2SchriftlichCounter == 2) {
			eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Note % der Ergänzungsprüfung ein: ");
			
			//Note wird mit mit 1/3 in Erganzung eingetragen
			AP2Ergaenzung = (1.0*(Integer.parseInt(eingabe)))/3 + (MaxAP2Er*2)/3;
			}
		// Wenn AP2 gesamt Note unter 50% liegt ist eine Ergaenzungpruefung erforderlich
		} else if (AP2Gesamt < 40) {
			eingabe = JOptionPane.showInputDialog(
					"Geben Sie den Note % der Ergänzungsprüfung ein: ");
			//Note wird mit mit 1/3 in Erganzung eingetragen
			AP2Ergaenzung = (1.0*(Integer.parseInt(eingabe)))/3;
		}
		
		
		// Gesamt Note AP2 wird mit Ergaenzungpruefung eingetragen, wenn nicht erforderlich dann wird es +0 bewertet.
		AP2Gesamt += 0.1 * AP2Ergaenzung;
				
		bestanden = (AP1*0.2 + AP2Gesamt) >= 50.0;
		
		System.out.println("Punkte AP1 von 20:\t" + (int)(AP1*0.2));
		System.out.println("Punkte Berufbezogene Schriftliche Prüfung 1 von 10:\t" + (int)(AP2BerfuSchrif1*0.1));
		System.out.println("Punkte Berufbezogene Schriftliche Prüfung 1 von 10:\t" + (int)(AP2BerfuSchrif2*0.1));
		System.out.println("Punkte Berufbezogene Schriftliche Prüfung 1 von 10:\t" + (int)(AP2BerfuSchrif3*0.1));
		System.out.println("Punkte Berufbezogene Schriftliche Prüfung 1 von 25:\t" + (int)(AP2ProjektDoku*0.25));
		System.out.println("Punkte Berufbezogene Schriftliche Prüfung 1 von 25:\t" + (int)(AP2ProjektPraes*0.25));
		if (AP2Ergaenzung > 0 ) {
			System.out.println("Punkte Ergaenzung:\t" + (int)(0.1* AP2Ergaenzung));
		}
		System.out.println("Punkte AP2 von 80:\t" + (int)AP2Gesamt);
		
		
		if (bestanden == true){
			System.out.println("Sie haben Bestanden mit Note:\t" + (int)(AP2Gesamt + (AP1*0.2)));
		} else {
			System.out.println("Sie haben NICHT Bestanden mit Note:\t" + (int)(AP2Gesamt + (AP1*0.2)));
		}
	}
}