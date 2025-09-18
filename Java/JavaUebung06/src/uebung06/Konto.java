package uebung06;
/**
 * Superclasse fuer die Kontos
 */
public class Konto {
	/**
	 * Die Kontonummer als String
	 */
	private String kontonummer;
	/**
	 * Der Kontostand als double
	 */
	private double kontostand;
	
	/**
	 * Konstruktor fuer den Kontostand mit Kontonummer und Kontostand
	 * @param kontonummer Kontonummer wird gespeichert
	 * @param kontostand Kontostand wird gespeicher
	 */
	public Konto(String kontonummer, double kontostand){
		setKontonummer(kontonummer);
		setKontostand(kontostand);
	}
	
	/**
	 * Getter fuer die Kontonummer
	 * @return Gibt die Kontonummer zurueck.
	 */
	public String getKontonummer() {
		return kontonummer;
	}
	
	/**
	 * Setzt die Konotonummer ein
	 * @param kontonummer Die Kontonummer wird als String eingegeben.
	 */
	public void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}
	
	/**
	 * Getter fuer den Kontostand
	 * @return Gibt den Kontostand zurueck
	 */
	public double getKontostand() {
		return kontostand;
	}
	
	/**
	 * Setzt den Kontostand ein
	 * @param kontostand Der Kontostand wird als double eingetragen.
	 */
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	/**
	 * Einzahlung wird im Kontostand eingerechnet.
	 * @param einzahlung Die Einzahlung wird als double eingetragen.
	 * @return Gibt den neuen Kontostand zurueck.
	 */
	public double einzahlen(double einzahlung) {
		this.kontostand += einzahlung;
		return this.kontostand;
	}
	
	/**
	 * Auszahlung wird dem Kontostand abgerechnet.
	 * @param auszahlung Die Auszahlung wird als double eingetragen.
	 * @return Gibt den neuen Kontostand zurueck.
	 */
	public double auszahlen(double auszahlung) {
		this.kontostand -= auszahlung;
		return this.kontostand;
	}
	
	/**
	 * Ausgabe der Kontonummer und Kontostand
	 */
	public void ausgabeKontoDetails() {
		System.out.println("Die Kontonummer ist: " + getKontonummer());
		System.out.println("Der Kontostand ist: " + getKontostand());
	}
}
