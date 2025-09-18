import javax.swing.*;
import java.awt.*;

public class Pupil extends JPanel {

    private int xPos, yPos; // Aufhängungspunkt für den Kreis
    private int squareSide; //Quadrat, Breite un Hoehe
    private Color c;

    public Pupil(int x, int y, int s){
        this.xPos = x;
        this.yPos = y;
        this.squareSide = s;
        c=Color.GREEN;
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
