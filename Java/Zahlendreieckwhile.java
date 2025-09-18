public class Zahlendreieckwhile {
	public static void main(String[] args){
		int zahl = 0;
		String text;
		String ausgabe = "";
		
	while (zahl < 10) {
		text = Integer.toString(zahl);
		ausgabe = ausgabe + text + " ";
		System.out.println(ausgabe);
		zahl = zahl + 1;
		}
	}
}