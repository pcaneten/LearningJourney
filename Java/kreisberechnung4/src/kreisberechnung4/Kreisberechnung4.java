package kreisberechnung4;

import javax.swing.*;

public class Kreisberechnung4 {

	public static void main(String[] args) {
		double radius, umfang, flaeche;
		String einheit, eingabe;
		eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
		radius = Double.parseDouble(eingabe);
		einheit = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
		umfang = 2.0 * 3.1415926 * radius;
		flaeche = 3.1415926 * radius * radius;
		System.out.println("Umfang: " + umfang + " " + einheit + "\nFlaeche: " + flaeche + " " + einheit + '\u00b2');
		// System.out.println("Flaeche: " + flaeche + " " + einheit + '\u00b2');
	}
}
