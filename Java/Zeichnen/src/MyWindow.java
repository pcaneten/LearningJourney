import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow() {

        this.setSize(800, 800);
        this.setTitle("My Fenster");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true); // nach der Gestaltung und Initialisierung anzeigen
    }

    @Override
    public void paint(Graphics g){

        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(), getHeight());
        g.setColor(Color.CYAN);
        g.fillRect(60,60,100,50);
        g.setColor(new Color(255,100,100));
        g.fillOval(60,120,80,80);
        g.setColor(Color.MAGENTA);
        int[] xCoords={460, 360, 560};
        int[] yCoords={210, 350, 350};
        g.fillPolygon(xCoords, yCoords, xCoords.length);
        int[] x1Coords={460, 360, 560};
        int[] y1Coords={450, 310, 310};
        g.fillPolygon(x1Coords, y1Coords, xCoords.length);
        g.setColor(Color.ORANGE);
        g.drawString("Patric", 260, 80);
        g.setColor(new Color(0x2EA32E));
        int[] xStarCoords={150,50,250,160};
        int[] yStarCoords={210,350,350,390};
        g.fillPolygon(xStarCoords, yStarCoords, xStarCoords.length);

        g.setColor(Color.PINK);
        /*
        int[] x2ndCoords={50, 150, 250};
        int[] y2ndCoords={650, 500, 650};
        g.fillPolygon(x2ndCoords, y2ndCoords, x2ndCoords.length);
        int[] x12ndCoords={50, 150, 250};
        int[] y12ndCoords={550, 700, 550};
        g.fillPolygon(x12ndCoords, y12ndCoords, x12ndCoords.length);
        */
        int[] x2ndCoords={50, 150, 250, 50, 150, 250};
        int[] y2ndCoords={650, 500, 650,550, 700, 550};
        g.fillPolygon(x2ndCoords, y2ndCoords, x2ndCoords.length);


        g.setColor(new Color(0x973413));
        int[] xDreiCoords={450, 550, 650};
        int[] yDreiCoords={550, 400, 550};
        g.fillPolygon(xDreiCoords, yDreiCoords, xDreiCoords.length);
        g.fillRect(610,470,20,50);
        g.setColor(Color.ORANGE);
        g.fillRect(450,550, 200, 200);
        g.setColor(Color.BLUE);
        g.fillRect(480, 600, 40, 40);
        g.fillRect(580, 600, 40, 40);
        g.setColor(new Color(0xAFAF3D));
        g.fillRect(530, 670, 40, 80);

        g.setColor(Color.lightGray);
        g.fillOval(610, 460, 20, 15);
        g.fillOval(615, 450, 25, 20);
        g.fillOval(620, 445, 30, 25);
        g.fillOval(625, 440, 35, 30);
        g.fillOval(630, 435, 40, 35);



    }



    public static void main(String[] args) {
        new MyWindow();

    }
}
