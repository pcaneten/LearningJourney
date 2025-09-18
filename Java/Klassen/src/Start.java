public class Start {

    public static void main(String[] args) {

        System.out.println("Begin");

        Ente emmi = new Ente();

        emmi.setFarbe("Weiss");

        System.out.println("Emmi ist: " + emmi.getFarbe());

        Ente otto = new Ente();
        otto.setFarbe("Schwarz");

        System.out.println("Otto ist: " + otto.getFarbe());

    }
}
