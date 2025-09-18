package msLizenzierung;
/**
 * Superklasse fuer die Lizenzen
 * @author Patric
 */
public class Lizenz {
	/**
	 * Name der Lizenz
	 */
	private String name;
	/**
	 * Der Stueckpreis der Lizenz
	 */
	private double stueckpreis;
	
	/**
	 * Die anzahl von Lizenzen
	 */
	private int lizenzAnzahl;
	
	/**
	 * Die anzahl von Clients
	 */
	private int clientAnzahl;
	
	/**
	 * Die anzahl der User
	 */
	private int userAnzahl;

	/**
	 * Standard Konstruktor
	 */
	Lizenz() {
	}
	
	/**
	 * Getter fuer den Lizenznamen
	 * @return Gibt den Lizenznamen zueruck
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setzt den Name der Lizenz ein
	 * @param name Der Name der Lizenz als String
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter fuer den Stueckpreis
	 * @return Gibt den Stueckpreis in Euro zurueck
	 */
	public double getStueckpreis() {
		return stueckpreis;
	}
	/**
	 * Setzt den Stueckpreis der Lizenz
	 * @param stueckpreis Stueckpreis als double
	 */
	public void setStueckpreis(double stueckpreis) {
		if(stueckpreis <= 0) {
			stueckpreis = 0;
		}
		this.stueckpreis = stueckpreis;
	}
	
	/**
	 * Setzt die Anzahl der Lizenzen ein
	 * @param lizenzAnzahl Anzahl der Lizenzen als integer
	 */
	public void setLizenzAnzahl (int lizenzAnzahl) {
		if(lizenzAnzahl <= 0) {
			lizenzAnzahl = 0;
		}
		this.lizenzAnzahl = lizenzAnzahl;
	}
	
	/**
	 * Getter fuer die Anzahl der Lizenzen
	 * @return Gibt anzahl der Lizenzen zurueck
	 */
	public int getLizenzAnzahl () {
		return this.lizenzAnzahl;
	}
	
	/**
	 * Getter fuer die Anzahl der Clients
	 * @return  Gibt anzahl der Clients zurueck
	 */
	public int getClientAnzahl() {
		return clientAnzahl;
	}
	
	/**
	 * Setzt die anzahl der Clients
	 * @param clientAnzahl Anzahl der Clients als Integer
	 */
	public void setClientAnzahl(int clientAnzahl) {
		if(clientAnzahl <= 0) {
			clientAnzahl = 0;
		}
		this.clientAnzahl = clientAnzahl;
	}
	
	/**
	 * Getter fuer die anzahl der User
	 * @return Gibt anzahl der User zurueck
	 */
	public int getUserAnzahl() {
		return userAnzahl;
	}
	
	/**
	 * Setz die anzahl der User
	 * @param userAnzahl Anzahl der User
	 */
	public void setUserAnzahl(int userAnzahl) {
		if(userAnzahl <= 0) {
			userAnzahl = 0;
		}
		this.userAnzahl = userAnzahl;
	}
}
