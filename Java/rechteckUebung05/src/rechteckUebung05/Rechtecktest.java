package rechteckUebung05;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		Rechteck rechteck1 = new Rechteck();
		
		rechteck1.setBreite(Double.parseDouble(JOptionPane.showInputDialog(
				"Bitte geben Sie die Breite eines Rechtecks ein")));
		rechteck1.setLaenge(Double.parseDouble(JOptionPane.showInputDialog(
				"Bitte geben Sie die Laenge eines Rechtecks ein")));
		
		rechteck1.ausgabeAlles();
		rechteck1.laengeVergroessern(-7);
		rechteck1.ausgabeAlles();
		rechteck1.breiteVergroessern(7);
		rechteck1.ausgabeAlles();
		
	}
}
