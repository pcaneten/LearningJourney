package quadratischeGleichung;

import javax.swing.JOptionPane;

public class QuadratischeGleichung {
	public static void main(String[] args) {
		int a, b, c, dis;
		a = Integer.parseInt(JOptionPane.showInputDialog(
				"Geben Sie eine Gesamtzahl a ein: "));
		b = Integer.parseInt(JOptionPane.showInputDialog(
				"Geben Sie eine Gesamtzahl b ein: "));
		c = Integer.parseInt(JOptionPane.showInputDialog(
				"Geben Sie eine Gesamtzahl c ein: "));
		dis = (b * b) - (4 * a * c);
		if (dis != 0) {
			if (dis > 0) {
				JOptionPane.showMessageDialog(null, "Es gibt 2 Lösungen");
			} else {
				JOptionPane.showMessageDialog(null, "Es gibt keine Lösung");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Es gibt eine Lösung");
		}
	}
}
