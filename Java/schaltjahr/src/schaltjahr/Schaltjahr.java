package schaltjahr;

import javax.swing.*;

/*
* Wir berechnen ob ein eingetragener Jahr Schaltjahr ist
* Die Formel wäre:
* Jahr is teilbar durch 4 
* nicht teilbar durch 100 
* ausser es ist teilbar durch 400
*/

public class Schaltjahr {
	public static void main(String[] args) {
		int jahr;
		// Jahr wird als integer definiert und die eingabe von String auf int umgewandelt
		jahr = Integer.parseInt(
				JOptionPane.showInputDialog(
					"Geben Sie einen Jahr zwischen 0 - 9999 ein: "));
					
		if (jahr % 4 == 0) {
			// Wenn jahr durch 4 teilbar ist wird es durch 100 geteilt
			if (jahr % 100 == 0) {
				// Wenn jahr durch 100 teilbar wird es durch 400 geteilt
				if (jahr % 400 == 0) {
					JOptionPane.showMessageDialog(null, "Der Jahr " + jahr + " ist ein Schaltjahr!");
				}
				// Durch 4 teilbar aber nicht 100
			} else {
					JOptionPane.showMessageDialog(null, "Der Jahr " + jahr + " ist ein Schaltjahr!");
			}
			// Nicht durch 4 teilbar
		} else {
			JOptionPane.showMessageDialog(null, "Der Jahr " + jahr + " ist kein Schaltjahr!");
		}
	}
}