public class Amphibienfahrzeug extends Auto implements MotorFahrzeug, IstSchwimmfhaehig{

    public Amphibienfahrzeug(int ps, String farbe) {
        super(ps, farbe);
    }

    @Override
    public void fahre() {
        System.out.println("Amphi fährt");
    }

    @Override
    public void stoppe() {
        System.out.println("Amphi stoppt");
    }

    @Override
    public void schwimme() {
        System.out.println("Amphi schwimmt");
    }
}
