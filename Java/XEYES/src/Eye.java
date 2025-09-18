import javax.swing.*;
import java.awt.*;

public class Eye extends JPanel {

    private int xPos, yPos;
    private int width, height;
    private Color c;

    private Pupil pupil;
    private Pupil2 pupil2;
    private Iris iris;

    public Eye(int x, int y, int w, int h){
        this.xPos = x;
        this.yPos = y;
        this.width = w;
        this.height = h;
        c = Color.WHITE;

        //pupil = new Pupil(xPos + 50, yPos + 40, height - 15);
        iris = new Iris(xPos + 50, yPos + 40, height - 15);
        pupil2 = new Pupil2(xPos + 50, yPos + 40, height - 45);

    }

    public Pupil getPupil(){
        return this.pupil;
    }

    public Pupil2 getPupil2(){
        return this.pupil2;
    }

    public Iris getIris(){
        return this.iris;
    }
    public void movePupil(int x, int y){

        //Mittelpunk des jewailigen Auges
        int xMiddlePoint = xPos + width/2;
        int yMiddlePoint = yPos + height/2;

        //Pythagoras
        double distance = Math.sqrt((x-xMiddlePoint)*(x-xMiddlePoint) +
                (y-yMiddlePoint)*(y-yMiddlePoint));

        //pupil.setxPos(xMiddlePoint + (int)(10/distance * (x - xMiddlePoint)));
        //pupil.setyPos(yMiddlePoint + (int)(10/distance * (y - yMiddlePoint)));
        iris.setxPos(xMiddlePoint + (int)(10/distance * (x - xMiddlePoint)));
        iris.setyPos(yMiddlePoint + (int)(10/distance * (y - yMiddlePoint)));
        pupil2.setxPos(xMiddlePoint + (int)(10/distance * (x - xMiddlePoint)));
        pupil2.setyPos(yMiddlePoint + (int)(10/distance * (y - yMiddlePoint)));

    }



    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(c);
        g.fillOval(xPos, yPos, width, height);
    }
}
