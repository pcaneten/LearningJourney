import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Face extends JPanel implements MouseMotionListener {

    private boolean isBackground = false; //Schaltervariablen Flag

    private Eye rightEye;
    private Eye leftEye;

    public Face(){
        rightEye = new Eye(300,200,140,70);
        leftEye = new Eye(100,200,140,70);

        //melde ich den Listener an
        //wer soll abgehorcht werden    add.. (wo ist der listener implementiert)
        this.addMouseMotionListener(this);

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        if(!isBackground){
            setBackground(Color.LIGHT_GRAY);
            isBackground=true;
        }

        g.setColor(Color.ORANGE);
        g.fillOval(20,20,500,500);

        leftEye.paintComponent(g);
        rightEye.paintComponent(g);
        //leftEye.getPupil().paintComponent(g);
        //rightEye.getPupil().paintComponent(g);

        leftEye.getIris().paintComponent(g);
        rightEye.getIris().paintComponent(g);
        leftEye.getPupil2().paintComponent(g);
        rightEye.getPupil2().paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(230,250,80,80);

        g.setColor(Color.GRAY);
        g.fillRect(150, 370, 250, 50);
        g.setColor(Color.BLACK);
        g.fillRect(125, 350, 300, 10);
        g.setColor(Color.WHITE);
        g.fillRect(175, 370,200,10);
        g.fillRect(175, 410,200,10);
        g.setColor(Color.RED);
        g.fillOval(225, 395, 100, 25);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
       // System.out.println(e.getX() + " " + e.getY());
        leftEye.movePupil(e.getX(), e.getY());
        rightEye.movePupil(e.getX(), e.getY());

        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        leftEye.movePupil(e.getX(), e.getY());
        rightEye.movePupil(e.getX(),e.getY());

        repaint();
    }

}
