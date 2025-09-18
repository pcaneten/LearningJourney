package personenverwaltung;

public class Stadt extends Region {
	private String timeZone;

	/*Stadt(){
		timeZone = timeZone.getDefault();
 	}*/

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
}
