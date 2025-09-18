package rechteckUebung05;

public class Rechteck {
	double laenge;
	double breite;
	
	/**
	 * Default Wert 0
	 */
	Rechteck(){
		this.laenge = 0;
		this.breite = 0;
	}
	/**
	 * 
	 * @param laenge
	 * @param breite
	 * Bietet die möglichkeit lange und breite von anfang
	 * einzutragen.
	 */
	Rechteck(double laenge, double breite){
		setLaenge(laenge);
		setBreite(breite);
	}
	
	/**
	 * 
	 * @param laenge
	 * Laenge kann definiert werden.
	 */
	void setLaenge(double laenge){
		if(laenge >= 0) {
			this.laenge = laenge;
		} 
	}
	
	/**
	 * 
	 * @param breite
	 * Breite kann definiert werden
	 */
	void setBreite(double breite){
		if(breite >= 0) {
			this.breite = breite;
		} 
	}
	
	/**
	 * 
	 * @param laenge
	 * @param breite
	 * lanege und breite kann definiert werden.
	 */
	void setSeiten(double laenge, double breite){
		setBreite(laenge);
		setLaenge(breite);		
	}
	
	/**
	 * 
	 * @return
	 * Gibt die vorhande laenge aus.
	 */
	double getLaenge() {
		return this.laenge; 
	}
	
	/**
	 * 
	 * @return
	 * gibt die vorhandede breite aus.
	 */
	double getBreite() {
		return this.breite;
	}
	
	/**
	 * 
	 * @return
	 * berechnet die laengste Seite
	 */
	double getLangeSeite() {
		if (getBreite()>getLaenge()) {
		return getBreite();
		} else {
		return getLaenge();
		}
	}
	
	/**
	 * 
	 * @return
	 * berechnet die kurzte Seite
	 */
	double getKurzeSeite() {
		if (getBreite()<getLaenge()) {
			return getBreite();
		} else {
			return getLaenge();
		}
	}
	
	/**
	 * 
	 * @return
	 * berechnet die Diagonale
	 */
	double getDiagonale() {
		double diagonale = Math.sqrt((getBreite()*getBreite())+(getLaenge()*getLaenge()));
		return diagonale;
	}
	
	/**
	 * 
	 * @return
	 * berechnet die Flaeche
	 */
	double getFlaeche() {
		return getBreite() * getLaenge();
	}
	
	/**
	 * 
	 * @return
	 * brechnet den Umfang
	 */
	double getUmfang() {
		return (2*getBreite() + 2*getLaenge());
	}
	
	/**
	 * Gibt eine Laenge vor definierte laenge aus
	 */
	void laengeAusgeben() {
		double laenge = 5.4;
		System.out.println("Länge: " + laenge);
	}
	
	/**
	 * 
	 * @param laenge
	 * Vergroessert die Laenge
	 */
	void laengeVergroessern(double laenge) {
		setLaenge(getLaenge()+ laenge);
	}
	
	/**
	 * 
	 * @param breite
	 * Vergroesser die Breite
	 */
	void breiteVergroessern(double breite) {
		setBreite(getBreite()+laenge);
	}
	
	/**
	 * 
	 * @param laenge
	 * Verkleinert die Laenge
	 */
	void laengeVerkleinern(double laenge){
		setLaenge(getLaenge()- laenge);
	}
	
	/**
	 * 
	 * @param breite
	 * Verkleinert die Breite
	 */
	void breiteVerkleinern(double breite){
		setBreite(getBreite()- laenge);
	}
	void ausgabeAlles() {
		System.out.println("Die kurze Seite ist: " + getKurzeSeite());
		System.out.println("Die laenge Seite ist: " + getLangeSeite());
		System.out.println("Die Diagonale ist: " + getDiagonale());
		System.out.println("Der Umfang ist: " + getUmfang());
	}
}
