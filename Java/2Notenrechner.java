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

public class 2Notenrechner{
	
	public static void main(String[] args){
		double AP1, AP2Berfu1, AP2Berfu2, AP2Wiso, AP2Doku, AP2Preas, AP2Ergaenzung, AP2Gesamt;
		int AP2ErgaenzungCounter = 0;
		int AP2SchriftlichCounter = 0;
		boolean bestanden = false;
		
		AP1 = Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie den Noten % der AP1 ein "));
		AP2Berfu1 = Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Berfubezogene Schriftliche Prüfung 1 ein: "));
		AP2Berfu2 = Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Berfubezogene Schriftliche Prüfung 2 ein: "));
		AP2Wiso = Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Wiso Prüfung 1 ein: "));
		AP2Doku = Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Dokumentation der Projektarbeit ein: "));
		AP2Preas = Double.parseDouble(JOptionPane.showInputDialog(
					"Geben Sie den Noten % der Dokumentation der Präsentation ein: "));
					
					
		AP2Gesamt = 0.1 * AP2Berfu1 + 0.1 * AP2Berfu2 + 0.1 * AP2Wiso + 0.25 * AP2Doku + 0.25 * AP2Preas;
		bestanden = (AP1 + AP2Gesamt) >= 50;
		bestanden = (AP2Gesamt) >= 40;
		
		System.out.println("AP1 von 20 punkten:\t" + (int)(0.2 * AP1));
		System.out.println("AP2Berfu1 von 10 punkten:\t" + (int)(0.1 * AP2Berfu1));
		System.out.println("AP2Berfu2 on 10 punkten:\t" + (int)(0.1 * AP2Berfu2));
		System.out.println("AP2Wiso on 10 punkten:\t" + (int)(0.1 * AP2Wiso));
		System.out.println("AP2Doku on 25 punkten:\t" + (int)(0.25 * AP2Doku));
		System.out.println("AP2Preas on 25 punkten:\t" + (int)(0.25 * AP2Preas));
		System.out.println("Gesamt punkte AP2:\t" + AP2Gesamt);
		System.out.println("Bestanden:\t" + bestanden);
	}
}