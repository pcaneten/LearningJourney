package bruchtest;
/**
 * Subklasse Anteil, zur Ergaenzung des Klasse Bruch
 */

public class Anteil extends Bruch {
	/**
	 * Atribut der Klasse Bruch fuer die den verteilten teil.
	 */
	public static Bruch verteilt = new Bruch(0,1);
	
	/**
	 * Standard Konstruktor mit Wert 0
	 */
	Anteil(){
		super();
	}
	/**
	 * Konstruktor mit Zeahler und Nenner vergeben werden
	 * @param zaehler Der Zeahler wird als Integer eingetragen
	 * @param nenner Der Nenner wird als Integer eingetragen
	 */
	Anteil(int zaehler, int nenner){
		super(zaehler, nenner);
		verteilt = verteilt.addiere(this);
		if(this.getVerteilt() > 1) {
			System.out.println("Fehler! Es wurde zuviel Verteiilt./nDer Bruch " + this.Bruchstring() + "wurde nicht Berechnet.");
			verteilt = verteilt.subtrahiere(this);
		}
	}
	
	/**
	 * Getter fuer den verteilten Anteil 
	 * @return Gibt den Dezimalwert des verteilten Anteil zurueck
	 */
	public static double getVerteilt() {
		return verteilt.dezimalwert();
	}	
		
	/**
	 * Ermittelt den nicht verteilten betrag
	 * @return Gibt den noch nicht verteilten Anteil zurueck
	 */
	public Bruch getRest() {
		Bruch gesamt = new Bruch(1);
		return gesamt.subtrahiere(verteilt);
	}
	
	
	
	
	// Dieser Teil ist fuer tests. 
	// Ich moechte die Methoden setZeahler und setNenner so uberschreiben
	// Das bei enderung einer dieser Werte eines Anteils durch diese Methoden
	// Der Verteilt Wert sich auch akutalisiert
	
	/*
	/**
	 * Setzt den Zaehler und aktualisiert den Bruch Verteilt
	 * @param z Der Zaehler wird als Integer eingetragen.
	 */
	/*
	public void setZaehler(int zeahler) {
		if(verteilt.getNenner() == 0) {
			verteilt.setNenner(1);
		}
		super.setZaehler(zeahler);
		Bruch anteil = new Bruch(zeahler, super.getNenner());
		setVerteilt(anteil);
	}
	
	/**
	 * Setzt den Nenner und aktualisiert den Bruch Verteilt
	 * @param z Der Nenner wird als Integer eingetragen.
	 */
	/*
	public void setNenner(int nenner) {
		super.setNenner(nenner);		
	}
	
	/**
	 * Setzt den nenner fuer den Verteil
	 * @param nenner Der Nenner als integer wird eingetragen
	 */
	/*
	private static void setVerteiltNenner(int nenner){
		verteilt.setNenner(nenner);
	}
	/**
	 * Setzt den Zaehler fuer den Verteil
	 * @param nenner Der Zaehler als integer wird eingetragen
	 */
	/*
	private static void setVerteiltZaehler(int zaehler) {
		verteilt.setZaehler(zaehler);
	}
	*/
}
