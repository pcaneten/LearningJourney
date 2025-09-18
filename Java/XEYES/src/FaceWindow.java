import javax.swing.*;

public class FaceWindow extends JFrame {

    public FaceWindow(){
        super("XEYES");
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new Face());

        setVisible(true);
    }

}
