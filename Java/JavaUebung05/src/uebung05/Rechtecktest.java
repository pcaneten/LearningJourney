package uebung05;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		Rechteck rechteck1 = new Rechteck();
		
		rechteck1.setBreite(Double.parseDouble(JOptionPane.showInputDialog(
				"Bitte geben Sie die Breite eines Rechtecks ein")));
		rechteck1.setLaenge(Double.parseDouble(JOptionPane.showInputDialog(
				"Bitte geben Sie die Laenge eines Rechtecks ein")));
		System.out.println("Die kurze Seite ist: " + rechteck1.getKurzeSeite());
		System.out.println("Die laenge Seite ist: " + rechteck1.getLangeSeite());
		System.out.println("Die Diagonale ist: " + rechteck1.getDiagonale());
		System.out.println("Der Umfang ist: " + rechteck1.getUmfang());
		
	}

}
