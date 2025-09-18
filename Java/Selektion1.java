import javax.swing.JOptionPane; // importiert die window pop up library

public class Selektion1 {
	public static void main(String[] args) {
		double alter;
		String eingabe;
		// Alter abfrage
		eingabe = JOptionPane.showInputDialog(
								"Geben Sie Ihr Alter ein: ");
		alter = Double.parseDouble(eingabe);
		//Alter vergleich
		if (alter < 18) {
			JOptionPane.showMessageDialog(
						null, "Sorry nicht volljährig!"); // Nicht volljährig
		} else {
		  JOptionPane.showMessageDialog(null, 
						"Glückwunsch! Sie sind volljährig!"); // Volljährig
		}
	}
}