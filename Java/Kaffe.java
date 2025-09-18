import javax.swing.JOptionPane;

public class Kaffe {
	public static void main (String[] args) {
		
		// need to test why does it not work
		/*int n = JOptionPane.showConfirmDialog( 
			null, 
			"Müde?", JOptionPane.YES_NO_OPTION);
		if(true){
			JOptionPane.showMessageDialog(null, "Pause");
		}
		else {
			JOptionPane.showMessageDialog(null, "mach weiter");
		}
		System.exit(0);*/
		
		// this is from online website
		int n = JOptionPane.showConfirmDialog(
            null,
            "Would you like green eggs and ham?",
            "An Inane Question",
            JOptionPane.YES_NO_OPTION);

        if(true){
            JOptionPane.showMessageDialog(null, "HELLO");
        }
        else {
            JOptionPane.showMessageDialog(null, "GOODBYE");
        }

        System.exit(0);
    }
}
		