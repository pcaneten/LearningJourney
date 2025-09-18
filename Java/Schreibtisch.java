import javax.swing.JOptionPane;

public class Schreibtisch {
	public static void main(String[] args){
		String a, b;
		a = JOptionPane.showInputDialog("Geben Sie eine Gesamtzahl ein: ");
		b = JOptionPane.showInputDialog("Geben Sie eine weitere Gesamtzahl ein: ");
		While (a > 0 & b > 0); {
			if (a > b) { 
				a = a - b;
			} else {
				b = b - a;
			}
		if (b == 0) {
			JOptionPane.showMessageDialog(a);
		} else {
			JOptionPane.showMessageDialog(b);
			}
		}
	}
}