import javax.swing.JOptionPane;

public class Schleifenabbrueche {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++)
		
		/* zum testen von continue
		
		//Version 1 continue
		for (int i=1;i<=10;i++){
			if (i == 5) {
				continue;
		}
		System.out.println(i);
		}
		
		//Version 2 continue
		for (int i=1;i<=10;i++){
			if (i != 5) {
				System.out.println(i);
			}
		}
		*/
		
		/* break testing:
		
		// Version 1 break
		String eingabe;
		int x;
		while (true) {
			eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
			x = Integer.parseInt(eingabe);
			if (x>10){
				break;
			} else {
			System.out.println(x);
			}
		}
		
		// Version 2 break
		String eingabe;
		int x = 0;
		
		while (x <= 10) {
			eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
			x = Integer.parseInt(eingabe);
			if (x < 11) {
				System.out.println(x);
			}
		}  
		*/
	}
}