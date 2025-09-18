import java.util.Random;

public class PasswordGenerator{
	public static void main(String[] args){
		int passwordLenght = 8;
		String password = "";
		Random zufallsZhal = new Random();
		int zahl = 0;
		boolean grossBuchstabe = false;
		boolean kleinBuchstabe = false;
		boolean ziffer = false;
		boolean sonderzeichen = false;
		
		do{
			password = "";
			for (int i = 0; i < passwordLenght - 1; i++){
				zahl = (int)(zufallsZhal.nextInt(127));
				if (zahl > 33 && zahl < 126) {
					password += (char) zahl;
					if (zahl > 65 && zahl < 90){
						grossBuchstabe = true;
					} else if (zahl > 97 && zahl < 122) {
						kleinBuchstabe = true;
					} else if (zahl > 48 && zahl < 57){
						ziffer = true;
					} else {
						sonderzeichen = true;
					}
				} else {
					i--;
				}					
			}
		} while (!(grossBuchstabe == true && kleinBuchstabe == true && ziffer == true && sonderzeichen == true));
		
		System.out.println("Ihr neuer Password ist:\t" + password);
	}
}