import javax.swing.*;
import java.awt.*;

public class GameMenu extends JFrame {

    private int width = 600;
    private int height = 400;

    private JButton startGame;
    private JButton startMusic;


    public GameMenu(){
        super("Star Wars");
        this.setSize(width, height);
        this.setResizable(false);
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screensize.width + " " + screensize.height);

        setLocation((screensize.width-width)/2, (screensize.height-height)/2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // Nordbereich

        JPanel panelNorth = new JPanel(); //Grundlage fuer den Nordbereich
        panelNorth.setLayout(new FlowLayout());
        panelNorth.setBackground(Color.BLACK);

        startGame = new JButton();
        startGame.setBackground(Color.PINK);
        startGame.setText("START GAME");
        startGame.setFocusPainted(false);
        panelNorth.add(startGame);

        startMusic = new JButton();
        startMusic.setBorderPainted(false);
        startMusic.setBackground(Color.PINK);
        startMusic.setFocusPainted(false);
        //startMusic.setOpaque(false);
        startMusic.setText("START MUSIC");
        //startMusic.setText("<html><body style='background-color:red;'>START MUSIC</body></html>");
        panelNorth.add(startMusic);

        add(panelNorth, BorderLayout.NORTH);

        //Centerbereich
        JTextArea gameManual = new JTextArea();
        gameManual.setFont(new Font("Arial", Font.ITALIC, 20));
        gameManual.setForeground(Color.WHITE);
        gameManual.setBackground(Color.BLACK);
        gameManual.setText("Der Weltraum, unendliche Weiter \r\n" +
                "Wir schreiben das Jahr 2200.\r\n" +
                "Dies sind die Abenteuer des Raumschiffs Topazius...."
                );
        gameManual.setMargin(new Insets(30,30,30, 30));

        add(gameManual,BorderLayout.CENTER);


        setVisible(true);

    }
}
