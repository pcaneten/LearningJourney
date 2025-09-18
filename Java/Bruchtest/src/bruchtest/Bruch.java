package bruchtest;
/**
 * Bruch klasse fuer die Berechnung und ermittlung von Brueche.
 */
public class Bruch {
	/**
	 * Zaehler als Integer
	 */
	private int zaehler;
	/**
	 * Nenner als integer
	 */
	private int nenner;
		
	/**
	 * Standard Konstruktor ohne Parameter setzt Zeahler auf 0 und den Nenner auf 1
	 */
	public Bruch() {
		setZaehler(0);
		setNenner(1);
	}
	/**
	 * Konstruktor wenn nur 1 Parameter eingetragen wird
	 * Dieser wird als Zeahler eingetragen
	 * @param x Der Zaehler durch Integer variable X definiert.
	 */
	public Bruch(int x) {
		setZaehler(x);
		setNenner(1);
	}
	/**
	 * Konstruktor wenn alle Parameter eingetragen werden
	 * @param nenner Der nenner wird eingetragen
	 * @param zaehler Der Zaehler wird eingetragen
	 */
	public Bruch(int zaehler, int nenner) {
		setZaehler(zaehler);
		setNenner(nenner);
	}
	
	/**
	 * Lange asugabe des Bruchs in 3 zeilen
	 */
	public void ausgabeLang() {
		System.out.println("Der Zeahler des Bruchs ist hat den Wert: " + zaehler);
		System.out.println("Der Nenner des Bruchs ist hat den Wert: " + nenner);
		System.out.println(zaehler + "/" + nenner);
	}
	
	/**
	 * Getter fuer den Zaehler
	 * @return gibt den Zaehler zurueck
	 */
	public int getZaehler() {
		 return zaehler;
	}
	/**
	 * Getter fuer den Nenner
	 * @return gibt den Nenner zurueck
	 */
	public int getNenner() {
		 return nenner;
	}
	/**
	 * Setzt den Zaehler
	 * @param z Der Zaehler wird als Integer eingetragen.
	 */
	public void setZaehler(int zaehler) {
		 this.zaehler = zaehler;
	}
	/**
	 * Setzt den Nenner
	 * @param z Der Nenner wird als Integer eingetragen.
	 */
	public void setNenner(int nenner) {
		 this.nenner = nenner;
	}
	
	/**
	 * Einfache ausgabe des Bruchs
	 */
	public void ausgeben() {
		System.out.println(zaehler + "/" + nenner);
	}
	
	/**
	 * Methode um den Bruch in einen String umwandeln
	 * @return Gibt den Bruch als String zurueck
	 */
	public String Bruchstring() {
		 return zaehler + "/" + nenner;
	}
	/**
	 * Ermitteln des ggt und dann Nenner und Zahler dadurch teilen
	 */
	public void kuerzen() {
		int m, n,  r;
		m = getZaehler();
		n = getNenner();
		r = m % n;
		while (r > 0) { // Berechnung des ggT
			m = n;
			n = r;
			r = m % n;
		}
		setZaehler(getZaehler()/ n); // in n steht jetzt der ggT
		setNenner(getNenner()/n);
	} 
	/**
	 * Kurzung + einfache ausgabe
	 */
	public void gekuerzausgeben() {
		kuerzen();
		ausgeben();
	}
	/**
	 * Vergleicht zwei Objekte der Klasse Bruch
	 * @param x Ein Objekt der Klasse Bruch wird eingegeben.
	 * @return Es gibt zurueck ob dieser gleich ist(true) oder nicht(false)
	 */
	public boolean equals(Bruch x) {
		Bruch a = new Bruch(getZaehler(), getNenner());
		Bruch b = new Bruch(x.getZaehler(), x.getNenner());
		a.kuerzen();
		b.kuerzen();
		boolean equals = (a.getZaehler() == b.getZaehler()) && (a.getNenner() == b.getNenner());
		return equals;
	}
	/**
	 * Addiert zwei Brueche und ergibt einen neuen Bruch
	 * @param b Ein Objekt der Klasse Bruch wird eingetragen 
	 * @return Gibt einen neuen Bruch zurueck.
	 */
	public Bruch addiere(Bruch b) {
		int zaehler = this.getZaehler()*b.getNenner() + b.getZaehler()*this.getNenner();
		int nenner = this.getNenner() * b.getNenner();
		Bruch summe = new Bruch(zaehler, nenner);
		summe.kuerzen();
		return summe;
	}
	/**
	 * Substrahiert ein Bruch von einenn anderen und ergibt einen neuen Bruch
	 * @param b Ein Objekt der Klasse Bruch wird eingetragen 
	 * @return Gibt einen neuen Bruch zurueck.
	 */
	public Bruch subtrahiere(Bruch b) {
		int zaehler = this.getZaehler()*b.getNenner() - b.getZaehler()*this.getNenner();
		int nenner = this.getNenner() * b.getNenner();
		Bruch differenz = new Bruch(zaehler, nenner);
		differenz.kuerzen();
		return differenz;
	}
	
	/**
	 * Ermitelt den Dezimalwert
	 * @return Gibt den Dezimalwert des Bruchs zurueck.
	 */
	public double dezimalwert() {
		return (double) getZaehler()/getNenner();
	}
	
	/**
	 * Ermittlelt einen Bruch aus einen Dezimalwert mit Maximal 7 Nachkommestellen.
	 * @param dezimalwert Der Dezimalwert wird eingetragen.
	 * @return Gibt einen neuen Bruch zurueck
	 */
	public static Bruch siebenNachkommastellenWertZuBruch(double dezimalwert) {
		Bruch a = new Bruch ((int)(dezimalwert * Math.pow(10, 7)), (int)(Math.pow(10, 7)));
		a.kuerzen();
		return new Bruch(a.getZaehler(),a.getNenner());
	}
	
	
	/**
	 * der Bruch wird durch eine eingetragene zahl erweitert/multipliziert.
	 */
	void erweitern(int multiplicator) {
		zaehler = zaehler*multiplicator;
		nenner = nenner*multiplicator;
		ausgeben();
	}
	void erweitern(double multiplicator) {
		zaehler = (int)(zaehler*multiplicator);
		nenner = (int)(nenner*multiplicator);
		ausgeben();
	}
	
}