import javax.swing.JOptionPane;

// wier ueberpruefen ob ein buchstabe ein Vokal ist

public class Vokaltest {
	public static void main(String[] args){
		String eingabe;
		int length;
		char character;
			
		// abfrage nach einen Buchstaben
		eingabe = JOptionPane.showInputDialog(
								"Geben Sie ein Buchstaben ein: "); 
		//Ueberpruefung der laenge der eingabe
		length = eingabe.length();
		if (length > 1) {
			eingabe = JOptionPane.showInputDialog(
								"Geben Sie EIN Buchstaben ein: ");			
		}
		// Auswahl des ersten Buchstaben der eingabe und wandelt gross in klein Buchstaben
		character = eingabe.toLowerCase().charAt(0); 
		// Ueberpruefung ob es ein Vokal ist (a,e,i,o,u)
		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			// Ergebnis bei Vokal
			JOptionPane.showMessageDialog(null, character + " ist ein Vokal!");
			// Ergebnis bei kein Vokal
		} else {
			JOptionPane.showMessageDialog(null, character + " ist kein Vokal!");
		}
	}
}