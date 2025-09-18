/*
Spiel gegen den Computer

Jeder muss abwechselnd ziehen

man darf eine, zwei oder drei Münzen ziehen
wer die letzte Muenze nimmt, hat gewonnen

Eingabe einer Anfangsmuenzahl vom Menschen
Rechner startet mit der Muenzziehung.

 */

import java.util.Scanner;
import java.util.Random;


public class Muenzspiel {

    /*
    Funktion fuer die Muenzziehung des Rechners
    Zufallszahl zwischen 1 und 3 wird generiert.
    Returniert Anzahl der Muenzen die vom Rechner gezogen wurden.
     */
    static int rechner_zieht(int m){
        int muenzen;
        if(m%4 == 0) {
            Random rechnerZieht = new Random();
            muenzen = rechnerZieht.nextInt(1, 3); // Wenn user richtig spielt, bereits verloren.
        } else {
            muenzen = m%4;
        }

        if(muenzen == 1){
            System.out.println("Rechner nimmt " + muenzen + " Muenze");
        } else {
            System.out.println("Rechner nimmt " + muenzen + " Muenzen");
        }
        return muenzen;

    }

    /*
    Funktion fuer die Muenzziehung des Users
    Eingabe wird ueberprueft, bei nicht eingabe einer 1, 2 oder 3 wird erneut gefragt.
    Returniert Anzahl der Muenzen die vom User gezogen wurden
     */
    static int mensch_zieht(int m){

        Scanner in = new Scanner(System.in);
        int muenzen = in.nextInt();
        while (muenzen != 1 && muenzen != 2 && muenzen != 3){

            System.out.println("Bitte entweder eine 1, 2 oder 3 eingeben!");
            muenzen = in.nextInt();
        }
        if(muenzen == 1){
            System.out.println("Du nimmts " + muenzen + " Muenze");
        } else {
            System.out.println("Du nimmts " + muenzen + " Muenzen");
        }
        return muenzen;

    }

    public static void main(String[] args) {

        System.out.println("Spielanfang");

        System.out.println("Bitte gib eine Anfangsmuenzanzahl von 1 bis 100 ein: "); // Abfrage der Anfangsmuenzanzahl

        Scanner scanner = new Scanner(System.in);

        int muenzen = scanner.nextInt();

        /*
        Ueberpruefung der Eingabe und erfragt diese erneut wenn nicht eine Zahl zwischen 4 bis 100
         */
        if (muenzen < 4 || muenzen > 100) {

            System.out.println("Bitte gib eine Anfangsmuenzanzahl von 1 bis 100 ein: ");

            muenzen = scanner.nextInt();
        }

        System.out.println(("Wir spielen mit " + muenzen + " Muenzen"));

        /*
        Schleife fuer die Muenzenziehung
         */
        while(true){

            muenzen -= rechner_zieht(muenzen);
            System.out.println("Aktuell liegen " + muenzen + " Muenzen auf dem Tisch");

            if(muenzen <= 0){

                System.out.println("RECHNER GEWINNT");
                break;
            }

            muenzen -= mensch_zieht(muenzen);
            System.out.println("Aktuell liegen " + muenzen + " Muenzen auf dem Tisch");

            if(muenzen <= 0){

                System.out.println("MENSCH GEWINNT");
                break;
            }

        }
    }
}
