public class NotCentered {
	public static void main(String[] args){
		int zahl = 0;
		String text;
		String ausgabe = "";
			
		while (zahl <= 10) {
			text = Integer.toString(zahl);
			if (zahl==0) {
				ausgabe = text;	
			} else {
			ausgabe = text + " " + ausgabe + " " + text;
			}
		System.out.println(ausgabe);
		zahl = zahl + 1;
		}
	}
}