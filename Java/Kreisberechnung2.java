public class Kreisberechnung2 {
	public static void main(String[] args) {
		double radius;
		double umfang, inhalt;
		radius = Double.parseDouble(args[0]);
		umfang = 2.0 * 3.1415926 * radius;
		inhalt = 3.1415926 * radius * radius;
		System.out.print("Umfang: ");
		System.out.println(umfang);
		System.out.print("Flaeche: ");
		System.out.println(inhalt);
	}
}