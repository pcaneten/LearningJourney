import javax.swing.*;

/*
* Kalkulierung der Diskriminante für der quadratische Gleichung der Form ax2 + bx + c = 0
* who Diskriminante (dis) = b * b - 4 * a * c
*/
public class QuadratischeGleichung {
	public static void main(String[] args) {
		int a, b, c, dis;
		// eingabe der werte und convertierung von String zu int
		a = Integer.parseInt(JOptionPane.showInputDialog(
			"Geben Sie eine Gesamtzahl a ein: "));
		b = Integer.parseInt(JOptionPane.showInputDialog(
			"Geben Sie eine Gesamtzahl b ein: "));
		c = Integer.parseInt(JOptionPane.showInputDialog(
			"Geben Sie eine Gesamtzahl c ein: "));
		dis = (b * b) - (4 * a * c); 
/* 
* Diskriminante (dis) Formel wenn:
* dis = 0 -> 1 Loesung
* dis > 0 -> 2 Loesungen
* dis < 0 -> keine Loesung
*/
		if (dis != 0) {
			if (dis > 0) {
				// Wenn Diskiminante > als 0 ist
				JOptionPane.showMessageDialog(null, "Diskriminante ist positiv, also es gibt zwei Lösugen");
			} else {
				// Wenn Diskiminante < als 0 ist
				JOptionPane.showMessageDialog(null, "Diskriminante ist negativ, also es gibt keine Lösung");
			}
		} else {
			// Wenn Diskiminante = 0 ist
			JOptionPane.showMessageDialog(null, "Diskriminante ist 0, also es gibt eine Lösung");
		}
	}
}