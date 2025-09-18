package kreisUebung05;

public class Kreis {
	double radius;
	
	Kreis(){
		this.radius = 0;
	}
	Kreis(double radius){
		setRadius(radius);
	}
	
	/**
	 * 
	 * @return
	 * the radius of the object
	 */
	double getRadius() {
		return this.radius;
	}
	
	/**
	 * 
	 * @param radius
	 * defines the attribute radius
	 */
	void setRadius(double radius) {
		if(radius>=0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	};
	
	/**
	 * 
	 * @return
	 * calculates the circumference
	 */
	double getUmfang() {
		double umfang = 2.0 * Math.PI * this.radius;
		return umfang;
	}
	
	/**
	 * 
	 * @return
	 * calculates the area
	 */
	double getFlaeche() {
		double flaeche = Math.PI * this.radius * this.radius;
		return flaeche;
	}
	
	/**
	 * 
	 * @param umfang
	 * Berechnet den radius anhand des umfangs.
	 */
	void setUmfang(double umfang) {
		setRadius(umfang /(2.0 * Math.PI));
	}
	
	/**
	 * 
	 * @param flaeche
	 * Berechnet den radius anhand der fleache 
	 */
	void setFlaeche(double flaeche) {
		setRadius(Math.sqrt(flaeche/Math.PI));
	}
}