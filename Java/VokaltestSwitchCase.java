import javax.swing.JOptionPane;

/*
* Ein Buchstabe wird erfragt und ueberpruefung ob es ein Vokal ist
*/
public class VokaltestSwitchCase{
	public static void main(String[] args){
		String eingabe;
		char ch;
		eingabe = JOptionPane.showInputDialog(
					"Geben Sie einen Buchstaben ein: ");
		ch = eingabe.toLowerCase().charAt(0);
		// switch statement für die Vokal ueberpruefung
		switch (ch){
			case 'a': // kein break; fallthrough erwuenscht
			case 'e': // kein break; fallthrough erwuenscht
			case 'i': // kein break; fallthrough erwuenscht
			case 'o': // kein break; fallthrough erwuenscht
			case 'u': // kein break; fallthrough erwuenscht
				//ist ein Vokal
				JOptionPane.showMessageDialog(null, ch + " is ein Vokal!");
				break;
			default:
				// ist kein Vokal
				JOptionPane.showMessageDialog(null, ch + " ist kein Vokal!");
		}
	}
}