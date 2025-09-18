package kreisUebung05;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		Kreis kreis1 = new Kreis();
				
		kreis1.setRadius(Double.parseDouble(JOptionPane.showInputDialog(
					"Bitte geben Sie den Raidus eines Kreises ein")));
				
		System.out.println("Der Radius ist:\t" + kreis1.getRadius());
		System.out.println("Der Umfang ist:\t" + kreis1.getUmfang());
		System.out.println("Die Fläche ist:\t" + kreis1.getFlaeche());
		
		double kreis1Radius = kreis1.getRadius();
		System.out.println("Radius\t\t" + "Umfang\t\t" + "\t\tFlaeche");

		
		for(int i = 0; i < 29; i++) {
			System.out.println(kreis1.getRadius() + "\t\t" +
					kreis1.getUmfang() + "\t\t" + kreis1.getFlaeche());
			kreis1.setRadius(kreis1.getRadius()+kreis1Radius);
		}
	}

}

