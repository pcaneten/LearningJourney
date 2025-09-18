import javax.swing.JOptionPane;

public class GeradeUngerade {

	public static void main(String[] args) {
		int zahl;
		zahl = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Geben Sie eine Gesamtzahl ein: "));
		if (zahl % 2 == 0) {
			zahl = zahl * 2;
		} else {
			zahl = zahl + 1;
		}
		System.out.println(zahl);
	}
}
