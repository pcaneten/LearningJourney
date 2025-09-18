package selektion1;

import javax.swing.JOptionPane;

public class Selektion1 {
	public static void main(String[] args) {
		double alter; 
		String eingabe; 
		eingabe = JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: ");
		alter = Double.parseDouble(eingabe);
		if (alter < 18) {
			JOptionPane.showMessageDialog(null, 
					 "Sorry nicht volljährig!");
		} else {
			JOptionPane.showMessageDialog(null,
					"Glückwunsch! Sie sind vollJjährig!");
		}
	}
}
