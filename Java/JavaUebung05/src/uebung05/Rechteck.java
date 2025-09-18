package uebung05;

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
		} else {
			this.laenge = 0;
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
		} else {
			this.breite = 0;
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
		if (this.breite>this.laenge) {
		return this.breite;
		} else {
		return this.laenge;
		}
	}
	
	/**
	 * 
	 * @return
	 * berechnet die kurzte Seite
	 */
	double getKurzeSeite() {
		if (this.breite<this.laenge) {
			return this.breite;
		} else {
			return this.laenge;
		}
	}
	
	/**
	 * 
	 * @return
	 * berechnet die Diagonale
	 */
	double getDiagonale() {
		double diagonale = Math.sqrt((this.breite*this.breite)+(this.laenge*this.laenge));
		return diagonale;
	}
	
	/**
	 * 
	 * @return
	 * berechnet die Flaeche
	 */
	double getFlaeche() {
		return this.breite * this.laenge;
	}
	
	/**
	 * 
	 * @return
	 * brechnet den Umfang
	 */
	double getUmfang() {
		return ((2*this.breite) + (2*this.laenge));
	}
	
	/**
	 * Gibt eine Laenge aus
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
		setLaenge(getLaenge()+laenge);
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
		setLaenge(getLaenge()-laenge);
	}
	
	/**
	 * 
	 * @param breite
	 * Verkleinert die Breite
	 */
	void breiteVerkleinern(double breite){
		setBreite(getBreite()-laenge);
	}
	
}
