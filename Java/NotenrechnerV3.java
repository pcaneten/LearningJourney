/*
*
* Noten berechnung.
* 2 Hauptteile:	AP1(Generell) und AP2(Berfubezogen)
*	AP1 macht ein 20% der gesamt Note.
*	AP2 wird in 3 (AP2.1) Schriftliche Pruefungen + (AP 2.2) Projekt Arbeit (Doku+Pres) geteilt 
*	AP2.1 -- Die 3 Schriftliche Pruefungen sind je 10% der gesamt Note
*	AP2.2 -- Die Projekt Arbeit ist 50%, who 25% Dokumentation und 25% Presentation gilt
*
*	Bestanten ensteht wenn folgende Reglungen erfuellt werden:
*		Reglung 1: 	AP1 + AP2 > 50%
*		Reglung 2: 	AP2 > 50%
*		Reglung 3: 	AP2 min 3 Pruefungen ueber 50%	
*		Reglung 4: 	AP2 keine unter 30%
*
*	Automatisch "nicht bestanden" ensteht wenn:
*			3 AP2.1 pruefungen unter 50%
*			2 AP2.1 pruefungen unter 30%
*			1 AP2.1 pruefung unter 50% und 1 AP2.1 pruefung unter 25%
*		
*	Eine Ergaenzungspruefung ist möglich um diese Ziele zu erreichen.
*	Die Ergaenzungspruefung gilt um die Note einer der AP2.1 Pruefungen zu Ergaenzen, 
*	berechnung der neue Note:
*		(AP2.1 * 2/3) + (Ergaenzungspruefung * 1/3)
*	Wenn 2 Pruefungen der AP2.1 unter 50% wird die Ergaenzungspruefung wird diese entweder 
*	zu der AP2.1 berechnet die einen Wert zwischen 25% und 30% hat oder, wenn beide zwischen 
*	30% und 50% sind, die hochste der beiden Noten.
*		
*/

import javax.swing.JOptionPane;

public class NotenrechnerV3{
	
	public static void main(String[] args){
		double AP1, AP2Berfu1, AP2Berfu2, AP2Wiso, AP2Doku, AP2Preas;
		double ergebnissAP2, gesamtErgebniss;
		boolean ergaenzung = false;
		
		//	Schritt 1. Abfrage der Noten und umwandlung von % auf entschprechende gesamt Punkte
		AP1 = 0.2 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der AP1 in % ein:"));
			
		AP2Berfu1 = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der Berfubezogene Schriftliche Prüfung 1 in % ein: "));
				
		AP2Berfu2 = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der Berfubezogene Schriftliche Prüfung 2 in % ein: "));
				
		AP2Wiso = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der Wiso Prüfung in % ein: "));
				
		AP2Doku = 0.25 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Noten % der Dokumentation der Projektarbeit in % ein: "));
				
		AP2Preas = 0.25 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der Präsentation des Projektes in % ein: "));
		
		// Schritt 2. Uberpruefung ob automatisch unabhaengig der Ergaenzungspruefung ein "nicht bestanden" 
		// durch die ergebnisse der Schriftlichen Pruefungen (AP2.1) entsteht. Reglungen 3 und 4.
		
		// AP2.1 -> 3 Pruefungen unter 5 Punkte (50%)
		boolean ersterCheck = (AP2Berfu1<5 && AP2Berfu2<5 && AP2Wiso<5); 
		// AP2.1 -> 2 Pruefungen unter 3 Punkte (30%)
		boolean zweiterCheck = (AP2Berfu1<3&&AP2Berfu2>3) || (AP2Berfu1<3&&AP2Wiso>3) ||(AP2Wiso<3&&AP2Berfu2>3);
		// AP2.1 -> 1 Pruefung unter 5 Punkte (50%) und 1 Pruefung unter 2.5 Punkte (25%)
		boolean dritterCheck = (AP2Berfu1<5&&AP2Berfu2<2.5) || (AP2Berfu1<5&&AP2Wiso<2.5) || (AP2Berfu2<5&&AP2Berfu1<2.5) 
								|| (AP2Berfu2<5&&AP2Wiso<2.5) || (AP2Wiso<5&&AP2Berfu2<2.5) || (AP2Wiso<5&&AP2Berfu1<2.5);
		
		if (ersterCheck || zweiterCheck || dritterCheck) {
				System.out.println("Sorry, Prüfung wurde nicht bestanden, viel Glück bei dem nächsten Versuch!");
		} else {
			
			// Schritt 3. Berechnung ob Ergaenzungspruefung notwendig ist. Reglungen 3 und 4.
			// Ergaenzungspruefung wird zu 1/3 berechnet und der AP2.1 addiert die unter 3 Punkte hat oder wenn
			// 2 zwischen 3 und 5 Punkte die mit der hochste Punktzahl. Die entsprechende AP2.1 wird zu 2/3 berechnet.
			
			// Wenn 1 der AP2.1 Pruefungen unter 3 Punkte
			boolean vierterCheck = (AP2Berfu1<3) || (AP2Berfu2<3) || (AP2Berfu1<3);
			// Wenn 2 der 3 AP2.1 Pruefungen unter 5 Punkte
			boolean fuenfterCheck = (AP2Berfu1<5&&AP2Berfu2<5)||(AP2Berfu1<5&&AP2Wiso<5)||(AP2Berfu2<5&&AP2Wiso<5);
			// Wenn AP2 gesamt unter 40 Punkte hat
			boolean sechsterCheck = (AP2Berfu1 + AP2Berfu2 + AP2Wiso + AP2Doku + AP2Preas)<40;
			double AP2Ergaenzung = 0;
			
			if (vierterCheck || fuenfterCheck || sechsterCheck){
				// Abfrage der Note der Ergaenzungspruefung
				AP2Ergaenzung = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie den Note % der Ergänzungsprüfung ein: "));
				if(vierterCheck){
					// Uberprueft welcher der AP2.1 Pruefungen mit der Ergaenzungspruefung berechnet wird, 
					// wenn nur 1 unter 5 bzw. unter 3 Punkte hat.
					if(AP2Berfu1<3){
						AP2Berfu1 = AP2Ergaenzung*1/3 + AP2Berfu1*2/3;
					} else if (AP2Berfu2<3){
						AP2Berfu2 = AP2Ergaenzung*1/3 + AP2Berfu2*2/3;
					} else {
						AP2Wiso = AP2Ergaenzung*1/3 + AP2Wiso*2/3;
					}	
				} else if (fuenfterCheck) {
					// Uberprueft welcher der AP2.1 Pruefungen mit der Ergaenzungspruefung berechnet wird, wenn 2 unter 5 Punkte haben.
					boolean ergaenzungAP2Berfu1 = (AP2Berfu1<5)&&((AP2Berfu1<3)|| (AP2Berfu1>AP2Berfu2)||(AP2Berfu1>AP2Wiso));
					boolean ergaenzungAP2Berfu2 = (AP2Berfu2<5)&&((AP2Berfu2<3)|| (AP2Berfu2>AP2Berfu1)||(AP2Berfu2>AP2Wiso));
					//boolean ergaenzungAP2Wiso = (AP2Wiso<5)&&((AP2Wiso<3)|| (AP2Wiso>AP2Berfu2)||(AP2Wiso>AP2Berfu2)); <-- nicht notwendig
					if(ergaenzungAP2Berfu1){
						AP2Berfu1 = AP2Ergaenzung*1/3 + AP2Berfu1*2/3;
					} else if (ergaenzungAP2Berfu2){
						AP2Berfu2 = AP2Ergaenzung*1/3 + AP2Berfu2*2/3;
					} else {
						AP2Wiso = AP2Ergaenzung*1/3 + AP2Wiso*2/3;
					}	
				} else {
					// Wenn Ergaenzungspruefung wegen AP2 gesamt Note unter 40 Punkte ist
					// Wird der kleinster Wert der Ap2.1 verwendet. 
					if ((AP2Berfu1<AP2Berfu2)&&(AP2Berfu1<AP2Wiso)){
						AP2Berfu1 = AP2Ergaenzung*1/3 + AP2Berfu1*2/3;
					} else if ((AP2Berfu2<AP2Berfu1)&&(AP2Berfu2<AP2Wiso)){
						AP2Berfu2 = AP2Ergaenzung*1/3 + AP2Berfu2*2/3;
					} else {
						AP2Wiso = AP2Ergaenzung*1/3 + AP2Wiso*2/3;
					}
				}
			}
			
			// Schritt 4. Endberechnung und auswertung. Reglugen 1 und 2.
			
			double AP2Projekt = AP2Doku + AP2Preas;
			ergebnissAP2 = AP2Berfu1 + AP2Berfu2 + AP2Wiso + AP2Projekt;
			boolean	bestanden = ergebnissAP2>=40; 
			gesamtErgebniss = AP1 + ergebnissAP2;
			if(bestanden){
				bestanden = gesamtErgebniss>=50;
			}
			
			// Ausgabe der Punkte, Ergebnisse und Note
			System.out.println("AP1 hat von 20 Punkten:\t" + (int)AP1);
			System.out.println("AP2 Berfu1 hat von 10 Punkten:\t" + (int)AP2Berfu1);
			System.out.println("AP2 Berfu2 hat von 10 Punkten:\t" + (int)AP2Berfu2);
			System.out.println("AP2 Wiso hat von 10 Punkten:\t" + (int)AP2Wiso);
			System.out.println("AP2 Doku hat von 25 Punkten:\t" + (int)AP2Doku);
			System.out.println("AP2 Preas hat von 25 Punkten:\t" + (int)AP2Preas);
			System.out.println("AP2 Projekt hat von 50 Punkten:\t" + (int)(AP2Doku+AP2Preas));
			System.out.println("AP2 gesamt hat von 80 Punkten:\t" + (int)ergebnissAP2);
			if(vierterCheck || fuenfterCheck || sechsterCheck){System.out.println("Deine Ergänzungs Punkte:\t" + AP2Ergaenzung);}
			System.out.println("Gesamt Punkte:\t" + (int)gesamtErgebniss);
			System.out.println("Bestanden:\t" + bestanden);
			// Berechnung nach Deutschen 1 bis 6 Notensystem.
			double note = (AP1 + ergebnissAP2);
			if(note >= 92){
				note = 1; 
			} else if ((note<92)&&(note>=81)){
				note = 2;
			} else if ((note<81)&&(note>=67)){
				note = 3;
			} else if ((note<67)&&(note>=50)){
				note = 4;
			} else if ((note<50)&&(note>=30)){
				note = 5;
			} else {
				note = 6;
			}
			System.out.println("Mit folgender Note:\t" + (int)note);
		}
	}
}