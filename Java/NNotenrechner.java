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

public class NNotenrechner{
	
	public static void main(String[] args){
		double AP1, AP2Berfu1, AP2Berfu2, AP2Wiso, AP2Doku, AP2Preas, AP2Gesamt;
		double AP2Ergaenzung = 0.0;
		int Unter3 = 0;
		int Unter5 = 0;
		boolean bestanden = true;
		boolean Ergaenzung = false;
		
		// Schritt 1 Abfrage der Noten % mit neuabfrage wenn ein Wert ueber 100% eingetragen wurde.
		// Werte werden bereits in deren Punktzahl berechnet AP1 zu 0.2(20%), AP2.1 je 0.1(10%) und AP2.2 je 0.25(25%)
				
		AP1 = 0.2 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der AP1 in % ein:"));
		if (AP1 > 20) {
			AP1 = 0.2 * Double.parseDouble(JOptionPane.showInputDialog(
					"\nMaximal Note ist 100%.\n\nBitte geben Sie die richtige Note der AP1 ein: "));
		}
		
		AP2Berfu1 = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der Berfubezogene Schriftliche Prüfung 1 in % ein: "));
		if (AP2Berfu1 > 10) {
			AP2Berfu1 = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"\nMaximal Note ist 100%.\n\nBitte geben Sie die richtige Note der Berfubezogene Prüfung 1 in % ein: "));
		}
		
		AP2Berfu2 = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der Berfubezogene Schriftliche Prüfung 2 in % ein: "));
		if (AP2Berfu2 > 10) {
			AP2Berfu2 = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"\nMaximal Note ist 100%.\n\nBitte geben Sie die richtige Note der Berfubezogene Prüfung 2 in % ein: "));
		}
		
		AP2Wiso = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der Wiso Prüfung in % ein: "));
		if (AP2Wiso > 10) {
			AP2Wiso = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
					"\nMaximal Note ist 100%.\n\nBitte geben Sie die richtige Note der Wiso in % ein: "));
		}
		
		AP2Doku = 0.25 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Noten % der Dokumentation der Projektarbeit in % ein: "));
		if (AP2Doku > 25) {
			AP2Doku = 0.25 * Double.parseDouble(JOptionPane.showInputDialog(
					"\nMaximal Note ist 100%.\n\nBitte geben Sie die richtige Note der Dokumentation in % ein: "));
		}
		
		AP2Preas = 0.25 * Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie die Note der Präsentation des Projektes in % ein: "));
		if (AP2Preas > 25) {
			AP2Preas = 0.25 * Double.parseDouble(JOptionPane.showInputDialog(
					"\nMaximal Note ist 100%.\n\nBitte geben Sie die richtige Note der Präsentation in % ein: "));
		}		
		
		// Schritt 2 ueberpruefung ob Ergaenzungspruefung notwendig ist und auch ob bereits ein "nicht bestanden" ensteht.	
		
		// Wenn bei der AP2.1 es 3 pruefungen unter 5 punkten (50%) oder 2 unter 3 punkte(30%) gibt ist automatisch "nicht bestanden".
		if (AP2Berfu1 < 5.0){
			Unter5++;
			if(AP2Berfu1 < 3.0){
				Unter3++;
				Ergaenzung = true;
			}
		}
		if (AP2Berfu2 < 5.0){
			Unter5++;
			//	Ueberprueft ob erster teil bereits unter 3 punkte (30%) hat.
			if((AP2Berfu2 < 3.0) && (Unter3 == 0)){
				Unter3++;
				Ergaenzung = true;
			} else if (Unter3 != 0) {
				bestanden = false;
			}
		}
		if ((AP2Wiso < 5.0) && bestanden){
			// Ueberprueft ob die anderen 2 teile der pruefung bereits unter 5 punkte (50%) haben.
			if (Unter5 >= 2){
			bestanden = false;
			} else {
			Unter5++;
				//	Ueberprueft ob punkte im ersten oder zweiten teil bereits unter 3(oder 30%) sind.
				if((AP2Wiso < 3.0) && (Unter3 == 0)){
					Unter3++;
					Ergaenzung = true;
				} else if (Unter3 != 0) {
					bestanden = false;
				}
			}
		}
				
		// Uberprueft ob bereits nicht bestanden und beendet den Programm falls zutreffend. 
		if (!bestanden) {
			System.out.println("Sorry, Prüfung wurde nicht bestanden, viel Glück bei dem nächsten Versuch!");
		} else {
			// Berechnet ob Ergaenzungspruefung notwendig ist anhand AP2 gesamt Note unter 40 punkte (50%)
			AP2Gesamt = AP2Berfu1 + AP2Berfu2 + AP2Wiso + AP2Doku + AP2Preas;
			Ergaenzung = AP2Gesamt < 40;
			
			// Note der Ergaenzungspruefung wird abgefrag, und bereits zu 1/3 berechnet und zum 10%(0.1) angebpasst.
			if(Ergaenzung) {
				AP2Ergaenzung = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
						"Geben Sie den Note % der Ergänzungsprüfung ein: "))/3;
						
			// Wenn AP2 Gesamt Note über 40 Punkte ist aber es 2 Pruefungen unter 5 punkte (50%) gab, 
			// wird erst geprueft ob einer der 2 unter 2.5 Punkte liegt, da in den fall automatisch "nicht bestanden" ensteht
												
			} else if (((Unter5 > 1) && (Unter3 != 0)) && ((AP2Berfu1 < 2.5) || (AP2Berfu2 < 2.5) || (AP2Wiso < 2.5))){
					bestanden = false;
			
			// Wenn beide ueber 25%, wird erst gebprueft ob einer der beiden zwischen 2.5 und 3 punkte liegt
			// da diese fuer die Ergaenzungspruefung verwendet wird, wenn beide zwischen 3 und 5 punkte haben
			// wird die verwendet die den hochsten Wert hat.
			} else if ((Unter5 == 1) && (Unter3 == 1)){
				Ergaenzung = true;
				AP2Ergaenzung = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
						"Geben Sie den Note % der Ergänzungsprüfung ein: "))/3;
				if (AP2Berfu1<3){
					AP2Berfu1 = AP2Berfu1 * 2/3;
					bestanden = (AP2Berfu1 + AP2Ergaenzung) >= 3;
				} else if (AP2Berfu2<3) {
					AP2Berfu2 = AP2Berfu2 * 2/3;
					bestanden = (AP2Berfu2 + AP2Ergaenzung) >= 3;
				} else if (AP2Wiso<3){
					AP2Wiso = AP2Wiso * 2/3;
					bestanden = (AP2Wiso + AP2Ergaenzung) >= 3;
				}
			} else if (bestanden && !Ergaenzung && ((Unter5 == 2) || ((Unter5 == 2) && (Unter3 == 1)))){
				Ergaenzung = true;
				AP2Ergaenzung = 0.1 * Double.parseDouble(JOptionPane.showInputDialog(
						"Geben Sie den Note % der Ergänzungsprüfung ein: "))/3;
				if(AP2Berfu1 < 5){
					if(AP2Berfu1 < 3){
						AP2Berfu1 = AP2Berfu1 * 2/3;
						bestanden = (AP2Berfu1 + AP2Ergaenzung) >= 5;
					} else {
						if (AP2Berfu1 > AP2Berfu2){
							AP2Berfu1 = AP2Berfu1 * 2/3;							
						} else if (AP2Berfu1 > AP2Wiso){
							AP2Berfu1 = AP2Berfu1 * 2/3;
						}
					}
				}
				if(AP2Berfu2 < 5){
					if(AP2Berfu2 < 3){
						AP2Berfu2 = AP2Berfu2 * 2/3;
						bestanden = (AP2Berfu2 + AP2Ergaenzung) >= 5;
					} else {
						if(AP2Berfu2 > AP2Berfu1){
							AP2Berfu2 = AP2Berfu2 * 2/3;
						} else if (AP2Berfu2 > AP2Wiso){
							AP2Berfu2 = AP2Berfu2 * 2/3;
						}
					}
				}
				if (AP2Wiso < 5){
					if(AP2Wiso < 3){
						AP2Wiso = AP2Wiso * 2/3;
						bestanden = (AP2Wiso + AP2Ergaenzung) >= 5;
					} else {
						if(AP2Wiso > AP2Berfu1){
							AP2Wiso = AP2Wiso * 2/3;
						} else if (AP2Wiso > AP2Berfu2){
							AP2Wiso = AP2Wiso * 2/3;
						}
					}
				}
			}
			// Erneute pruefung ob bestanden oder nicht um Programm weiter zu fueren oder abbrechen.
			if (!bestanden) {
			System.out.println("Sorry, Prüfung wurde nicht bestanden, viel Glück bei dem nächsten Versuch!");
			} else {	
			// Wenn bestanden noch ok, dann wird die Gesamt Note mit der Ergaenzungspruefung neuw berechnet 
			// wenn diese nicht stattgefunden hat, ist der Wert der Ergaenzungspruefung 0
			AP2Gesamt = AP2Berfu1 + AP2Berfu2 + AP2Wiso + AP2Doku + AP2Preas + AP2Ergaenzung;
			bestanden = (AP2Gesamt) >= 40;
			bestanden = (AP1 + AP2Gesamt) >= 50;
			}
			// Ausgabe der Ergebnisse
			System.out.println("AP1 von 20 punkten:\t" + (int)AP1);
			System.out.println("AP2Berfu1 von 10 punkten:\t" + (int)AP2Berfu1);
			System.out.println("AP2Berfu2 on 10 punkten:\t" + (int)AP2Berfu2);
			System.out.println("AP2Wiso on 10 punkten:\t" + (int)AP2Wiso);
			System.out.println("AP2Doku on 25 punkten:\t" + AP2Doku);
			System.out.println("AP2Preas on 25 punkten:\t" + AP2Preas);
			System.out.println("Gesamt punkte AP2:\t" + (int)AP2Gesamt);
			if(Ergaenzung){System.out.println("Ergänzungs punkte:\t" + AP2Ergaenzung);}
			System.out.println("Gesamt punkte:\t" + (int)(AP1 + AP2Gesamt));
			System.out.println("Bestanden:\t" + bestanden);
			// Berechnung nach Deutschen 1 bis 6 Notensystem.
			double note = (AP1 + AP2Gesamt);
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
			
			System.out.println("Mit folgender Note:\t" + (int)note);
			} 
		}
	}
}