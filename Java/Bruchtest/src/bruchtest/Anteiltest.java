package bruchtest;

public class Anteiltest {

	public static void main(String[] args) {
		 int vermoegen = 200000;
		 Anteil a1 = new Anteil(1,4);
		 Anteil a2 = new Anteil(1,2);
		 
		 System.out.println("Anteil a1: " +a1.Bruchstring());
		 System.out.println("Betrag von a1 :" + vermoegen * a1.dezimalwert());
		 System.out.println("Anteil a2: " +a2.Bruchstring());
		 System.out.println("Betrag von a2: " + vermoegen * a2.dezimalwert());
		 System.out.println("Verteilt: " + a1.verteilt.Bruchstring());
		 System.out.println("Rest: " +a1.getRest().Bruchstring()); 
		 System.out.println("Restbetrag: " + vermoegen * a1.getRest().dezimalwert());
	}

}
