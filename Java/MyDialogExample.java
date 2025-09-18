import javax.swing.JOptionPane;

public class MyDialogExample {
    public static void main(String[] args) {
        // Display a plain message dialog
		String tomato = "tomato";
        JOptionPane.showMessageDialog(null, "This is a plain message.", "Tomato", JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, tomato);
    }
}