public class Centered {
	public static void main(String[] args){
		int zahl = 0;
		String text;
		String ausgabe = "";
		int space = 32;
					
		while (zahl <= 10) {
			text = Integer.toString(zahl);
			if (zahl==0) {
				ausgabe = text;
				} else {
			ausgabe = text + " " + ausgabe + " " + text;
			}
			space = space - zahl;
			while (space > 0) {
				System.out.print(" ");
				space--;
			}
		System.out.println(ausgabe);
		zahl = zahl + 1;
		}
	}
}