import javax.swing.*;
import java.awt.*;

public class Iris extends JPanel {
    private int xPos, yPos; // Aufhängungspunkt für den Kreis
    private int squareSide; //Quadrat, Breite un Hoehe
    private Color c;
    private Pupil2 pupil;

    public Iris(int x, int y, int s){
        this.xPos = x;
        this.yPos = y;
        this.squareSide = s;
        c=Color.RED;

        pupil = new Pupil2(xPos + 25, yPos + 20, squareSide - 7);
    }

    public Pupil2 getPupil(){
        return this.pupil;
    }

    public void setxPos(int x){
        this.xPos=x;
    }
    public int getxPos(){
        return this.xPos;
    }
    public void setyPos(int y){
        this.yPos=y;
    }
    public int getyPos(){
        return this.yPos;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(this.c);
        g.fillOval(this.xPos-this.squareSide/2, this.yPos-this.squareSide/2, this.squareSide, this.squareSide);
    }
}
