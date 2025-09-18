import javax.swing.JOptionPane;

public class Vokaltest1 {
	public static void main(String[] args){
		String eingabe;
		char c;
		eingabe = JOptionPane.showInputDialog(
			"Geben Sie ein Buchstaben ein: "); 
		c = eingabe.toLowerCase().charAt(0); 
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			JOptionPane.showMessageDialog(null, "Der erste Buchstabe, " + c + ", ist ein Vokal!");
		} else {
			JOptionPane.showMessageDialog(null, "Der erste Buchstabe, " + c + ", ist ein Vokal!");
		}
	}
}