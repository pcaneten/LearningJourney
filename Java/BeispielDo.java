public class BeispielDo {
	public static void main (String[] args){
		int zahl = 1;
		do {
			System.out.println(zahl);
			zahl = zahl + 1;
		} while (zahl <= 100);
	}
}