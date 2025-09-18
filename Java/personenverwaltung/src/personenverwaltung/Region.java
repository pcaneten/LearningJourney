package personenverwaltung;

public class Region extends Land {
	private String offizielleSprache;
	 
	Region(){
		offizielleSprache = "Englisch"; 
	 }

	public String getOffizielleSprache() {
		return offizielleSprache;
	}

	public void setOffizielleSprache(String offizielleSprache) {
		this.offizielleSprache = offizielleSprache;
	}
}
