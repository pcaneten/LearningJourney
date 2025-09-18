public class Start {

    public static void main(String[] args){

        Cabrio ca = new Cabrio(80, "gruen");
        ca.fahre();
        ca.oeffneDach();

        Coupe co = new Coupe(120, "rot");
        co.fahre();
        co.starte();
        co.stoppe();

        Motorrad motti = new Motorrad();
        motti.starte();
        motti.stoppe();

    }
}
