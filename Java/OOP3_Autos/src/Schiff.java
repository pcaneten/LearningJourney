public class Schiff implements IstSchwimmfhaehig, MotorFahrzeug{


    @Override
    public void starte() {
        System.out.println("Schiff startet");
    }

    @Override
    public void stoppe() {
        System.out.println("Schiff stoppt");
    }

    @Override
    public void schwimme() {
        System.out.println("Schiff schwimmt");
    }
}
