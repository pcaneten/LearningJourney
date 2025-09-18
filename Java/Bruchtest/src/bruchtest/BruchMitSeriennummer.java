package bruchtest;
/**
 * Subklasse um die Klasse Bruch eine Seriennummer zu vergeben
 */
public class BruchMitSeriennummer extends Bruch {
	/**
	 * Integer fuer die anzahlder Brueche
	 */
	static int anzahlBrueche = 0;
	/**
	 * Integer fuer die Seriennummer
	 */
	private final int seriennnummer;
	
	
	/**
	 * Konstruktor mit 2 Parameter (Zaehler und Nenner)
	 * @param zaehler Der Zaehler wird als Integer eingetragen
	 * @param nenner Der Nenner wird als Integer eingetragen
	 */
	BruchMitSeriennummer(int zaehler, int nenner){
		super(zaehler, nenner);
		anzahlBrueche++;
		seriennnummer = anzahlBrueche;
	}
	
	/**
	 * Konstruktor mit keinen Parameter wird automatisch eienen Zaehler mit Wert 0
	 * und einen Nenner mit Wert 1 vergeben.
	 */
	BruchMitSeriennummer(){
		this(0,1);
	}
	
	/**
	 * Konstruktor mit nur einen Parameter, Zaehler, eingetragen
	 * und der Nenner bekommt einen Wert von 1.
	 * @param zaehler Der Zaehler wird als Integer eingetragen
	 */
	BruchMitSeriennummer(int zaehler){
		this(zaehler, 1);
	}

	/**
	 * Getter fuer die Seriennummer
	 * @return Gibt die zuständige Seriennummer zurueck
	 */
	public int getSeriennnummer() {
		return seriennnummer;
	}
	
	/**
	 * Methode fuer eine Ausgabe der Seriennummer mit dem Bruch
	 */
	public void ausgabeMitSeriennumer(){
		System.out.print("Seriennummer: " + seriennnummer + " fuer Bruch: ");
		super.ausgeben();
		
	}

	
}
