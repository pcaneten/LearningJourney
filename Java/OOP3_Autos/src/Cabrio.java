public class Cabrio extends Auto {

    public Cabrio(int ps, String farbe){
        super(ps, farbe);
    }

    @Override
    public void fahre(){
        System.out.println("Cabrio fährt langsam... bruum bruum!");
    }

    public void oeffneDach(){
        System.out.println("Kurbel Dach auf....Ui!! Sch***e es regenet!!");
    }

}
