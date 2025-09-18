import javax.swing.*;

/*
* Wir berechnen ob ein eingetragener Jahr Schaltjahr ist
* Die Formel wäre:
* Jahr is teilbar durch 4 
* nicht teilbar durch 100 
* ausser es ist teilbar durch 400
*/

public class Schaltjahr2 {
	public static void main(String[] args) {
		int jahr;
		// Jahr wird als integer definiert und die eingabe von String auf int umgewandelt
		jahr = Integer.parseInt(
				JOptionPane.showInputDialog(
					"Geben Sie einen Jahr zwischen 0 - 9999 ein: "));
					
		if ((jahr % 4 == 0 && jahr % 100 == 0 && jahr % 400 == 0) || (jahr % 100 != 0 && jahr % 4 == 0)){
			// Jahr ist teilbar durch 4,100,400 oder 4 und nicht 100
			JOptionPane.showMessageDialog(null, "Der Jahr " + jahr + " ist ein Schaltjahr!");
		} else {
			// Jahr ist nicht teilbar durch 4 oder teilbar durch 1010 und nicht 400
			JOptionPane.showMessageDialog(null, "Der Jahr " + jahr + " ist kein Schaltjahr!");
			}
	}
}