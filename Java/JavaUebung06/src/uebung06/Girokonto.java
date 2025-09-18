package uebung06;
/**
 * Girokonto Klasse als eine erweiterung der Konto Klasse
 * Girokonto hat einen limit
 */
public class Girokonto extends Konto {
	/**
	 * Kontolimit als double
	 */
	private double limit;
	
	/**
	 * Standard Konstruktor fuer den Girokonto
	 * @param kontonummer Die Kontonummer wird eingtragen als String
	 * @param kontostand Der Kontostand wird als double eingetragen
	 * @param limit Der Limit wird als double eingetragen
	 */
	public Girokonto(String kontonummer, double kontostand, double limit){
		super(kontonummer, kontostand);
		setLimit(limit);
	}
	
	/**
	 * Getter fuer den limit
	 * @return Gibt den aktuellen Limit zurueck
	 */
	public double getLimit() {
		return limit;
	}
	
	/**
	 * Setzt den Limit
	 * @param limit Der Limit wird als double eingtragen.
	 */
	public void setLimit(double limit) {
		if(limit > 0) {
			limit *= (-1);
		}
		this.limit = limit;
	}
	
	/**
	 * Berechnet ob die Auszahlung moeglich ist und aktualisiert den Kontostand wenn zutrefend
	 * return den aktuellen Kontostand
	 */
	public double auszahlen(double auszahlung) {
		if((getKontostand()-auszahlung) >= limit) {
			setKontostand(getKontostand() - auszahlung);
		} else {
			System.out.println("Fehler: Kreditlimit überschritten!");
		}
		return getKontostand();
	}
	
	
	

}