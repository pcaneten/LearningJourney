package vokaltest;

import javax.swing.JOptionPane;

public class Vokaltest {

	// we will request to enter a letter and see if it is a vowel
	public static void main(String[] args) {
		String eingabe; 
		int length;
		char character;
		// request for the letter
		eingabe = JOptionPane.showInputDialog(
						"Geben Sie ein Buchstaben ein: ");
		// review length of input
		length = eingabe.length();
		// if input has more than 1 letter request new input
		if (length > 1 ) {
			eingabe = JOptionPane.showInputDialog(
					"Geben Sie EIN Buchstaben ein: ");
		}
		// if length is as desired, turns input into lowercase
		character = eingabe.toLowerCase().charAt(0);
		// review if input is a vowel
		if (character == 'a' | character == 'e' | character == 'i' | character == 'o' | character == 'u') {
			//If vowel
			JOptionPane.showMessageDialog(null, character + " ist ein Vokal!");
		} else { 
			//If not vowel
			JOptionPane.showMessageDialog(null, character + " ist kein Vokal!");
		}

	}

}
