public class Motorrad implements MotorFahrzeug {
    @Override
    public void starte(){
        System.out.println("Motorrad startet");
    }

    @Override
    public void stoppe() {
        System.out.println("Motorrad stoppt");
    }


}
