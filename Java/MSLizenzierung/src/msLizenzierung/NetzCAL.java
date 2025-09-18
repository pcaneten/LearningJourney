package msLizenzierung;
/**
 * Die Klasse fuer die Netzwerk CALs
 * Basierend auf der Anzhl der Devices oder user wird
 * die Preiswerteste (userCAL oder deviceCAL) entschieden.
 */
public class NetzCAL extends Lizenz{
	/**
	 * Einzehlpreis fuer die User CAL
	 */
	private double userCAL;
	
	/**
	 * Einzehlpreis fuer die Device CAL
	 */
	private double deviceCAL;
	
	/**
	 * Konstruktor mit dem Stueckpreis fuer
	 * userCAL und deviceCAL
	 */
	NetzCAL(){
		userCAL = 45.0;
		deviceCAL = 40.0;
	}
	
	/**
	 * Getter fuer die Kosten pro User CAL
	 * @return Gibt Kosten pro User CAL zurueck
	 */
	double getUserCAL(){
		return userCAL;
	}
	
	/**
	 * Setzt den Einheitspreis fuer den User CAL
	 * @param userCAL Der neue Preis als double
	 */
	void setUserCAL(double userCAL) {
		if(userCAL>= 0) {
			this.userCAL = userCAL;
		}
	}
	
	/**
	 * Getter fuer die Kosten pro Device CAL
	 * @return Gibt Kosten pro Device CAL zurueck
	 */
	double getDeviceCAL() {
		return deviceCAL;
	}
	
	/**
	 * Setzt den Einheitspreis fuer den Device CAL
	 * @param deviceCAL Der neue CAL Preis als double
	 */
	void setDeviceCAL(double deviceCAL) {
		if(deviceCAL>= 0) {
			this.deviceCAL = deviceCAL;
		}
	}
	
	/**
	 * Berechnet User CALs mal Anzahl der User
	 * @return Gibt die Kosten fuer die User CALs zurueck
	 */
	double getPreisUserCAL(){
		return getUserAnzahl()*getUserCAL();
	}
	
	/**
	 * Berechnet Device CALs mal Anzahl der User
	 * @return Gibt die Kosten fuer die Device CALs zurueck
	 */
	double getPreisDeviceCAL() {
		return getClientAnzahl()*getDeviceCAL();
	}
	
	/**
	 * Berechnung der Netzwerk CALs Kosten
	 * Erst werden Kosten fuer User und Device berechnet.
	 * Wenn Kosten User CALs guenstiger dann wird diese als Kosten angezeigt
	 * alternativ  werden die Device CAL kosten angezeigt
	 * @return Gibt gesamt kosten der CAL zurueck
	 */
	double getNetzCALKosten() {
		double NetzCALKosten;
		if(getPreisUserCAL()<getPreisDeviceCAL()) {
			NetzCALKosten = getPreisUserCAL();
		} else {
			NetzCALKosten = getPreisDeviceCAL();
		}
		return NetzCALKosten;
	}
	
	/**
	 * Berechnung der Netzwerk CALs Kosten in den 5er Bundle
	 * Schritt 1: Wenn User und Clients nicht durch 5 teilbar, auf die nachste
	 * durch 5 teilbare Zahl erhohen
	 * Schritt 2: Kosten berechnen
	 * @return Gibt RealNetzCALKosten gibt die gunstigsten Kosten zurueck
	 */
	double getRealNetzCALKosten() {
		double RealNetzCALKosten;
		int tempUser = getUserAnzahl(); // Speichert die Anzahl der User vor der Berechnung
		int tempClient = getClientAnzahl(); // Speichert die Anzahl der Client vor der Berechnung
		while(getUserAnzahl()%5 != 0) {
			setUserAnzahl(getUserAnzahl()+1);
		}
		while(getClientAnzahl()%5 != 0) {
			setClientAnzahl(getClientAnzahl()+1);
		}
		
		if(getPreisUserCAL()<getPreisDeviceCAL()) {
			RealNetzCALKosten = getPreisUserCAL();
		} else {
			RealNetzCALKosten = getPreisDeviceCAL();
		}
		setUserAnzahl(tempUser); // Setzt die User Anzahl zurueck zum original
		setClientAnzahl(tempClient);// Setzt die Client Anzahl zurueck zum original
		return RealNetzCALKosten;
	}	
}
