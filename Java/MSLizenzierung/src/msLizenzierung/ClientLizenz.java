package msLizenzierung;
/**
 * Die Klasse fuer die Client-Lizenzen
 */
public class ClientLizenz extends Lizenz {
	
	/**
	 * Konstruktor mit dem Aktuellen Stueckpreis definiert
	 */
	ClientLizenz(){
		setStueckpreis(161);
	}
	
	/**
	 * Berechnet die kosten der Client Lizenzen 
	 * mit der anzahl der Lizenzen mal Stueckpreis
	 * @return Gibt die Kosten der Client Lizenzen.
	 */
	public double clientKosten() {
		return getClientAnzahl() * getStueckpreis();
	}
	
}
