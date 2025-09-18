package msLizenzierung;
/**
 * Die Klasse fuer die Server-Lizenzen
 */
public class ServerLizenz extends Lizenz {
	
	/**
	 * Konstruktor mit dem Aktuellen Stueckpreis definiert
	 */
	ServerLizenz(){
		setStueckpreis(890);
	}
	
	/**
	 * Setzt die lizenz anzahl mit ein minimum von 2	
	 * @param lizenzAnzahl Anzahl der Lizenzen als Integer
	 */
	public void setLizenzAnzahl(int lizenzAnzahl) {
		if(lizenzAnzahl < 2) {
			lizenzAnzahl = 2;
		} 
		super.setLizenzAnzahl(lizenzAnzahl);
	}
	
	/**
	 * Berechnet mit anzahl Lizenzen und den Lizenzpreis die Serverkosten
	 * @return Gibt den Preis fuer die Server Lizenzen zurueck
	 */
	public double serverKosten() {
		return getLizenzAnzahl() * getStueckpreis();
	}
}
