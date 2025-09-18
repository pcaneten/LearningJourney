public class Coupe extends Auto {

    public Coupe (int ps, String farbe){
        super(ps,farbe);
    }

    @Override
    public void fahre() {
        System.out.println("Coupe fährt sehr schnell.... bruuuum BRUUUUMM!!");

    }
}
