public abstract class Auto implements  MotorFahrzeug {

    private int ps;
    private String farbe;

    public Auto(int ps, String farbe){
        this.ps = ps;
        this.farbe = farbe;
    }

    abstract public void fahre();

    public void starte(){
        System.out.println("Auto startet");
    }

    public void stoppe(){
        System.out.println("Auto stopt");
    }

}
