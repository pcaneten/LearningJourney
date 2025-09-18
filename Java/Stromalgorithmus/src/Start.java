/*
 String text = "Sein oder Nichtsein, das; ist hier die Frage: \n" +  	    	//8
                "Obs edler im Gemüt, die Pfeil und Schleudern \n" +         	//8
                "Des wütenden Geschicks erdulden oder, \n" +                	//5
                "Sich waffnend gegen eine See von Plagen, \n" +             	//7
                "Durch Widerstand sie enden? Sterben schlafen \n" +         	//6
                "Nichts weiter! Und zu wissen, daß ein Schlaf \n" +         	//8
                "Das Herzweh und die tausend Stöße endet, \n" +             	//7
                "Die unsers Fleisches Erbteil, 's ist ein Ziel, \n" +       	//8
                "Aufs innigste zu wünschen. Sterben schlafen \n" +          	//6
                "Schlafen! Vielleicht auch träumen! \n";
									//Worte 67 Zeilen 10
            								    																								//Buchstaben 437 //6

Aufgabe: Möglichst als Stromalgorithmus denken, nicht mit Zeichenketten. Abprüfen der Länge mit str.length() ist erlaubt. Tip: arbeitet mit char (anders als im echten Strom, der mit byte arbeitet, das macht hier aber wegen den Sonderzeichen keinen Sinn). Schaut euch die Methode charAt() an.

Gesucht sind:

1. Anzahl der Buchstaben
2. Anzahl der Worte
3. Anzahl der Zeilen
4. Anzahl der Worte, die mit einem großen W oder einem kleinen w anfangen
5. Wie oft gibt es das Worte "schlafen" (kleingeschrieben)
 */

import java.util.Scanner;

public class Start {

    static String userInput(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String line;
        System.out.println("Schreiben Sie ihr Text (#E# um Eingabe zu beenden):");

        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if ((line.charAt(0) == '#') && (line.charAt(1) == 'E') && (line.charAt(2) == '#')){
                scanner.close();
                break;
            }
            input += line + "\n";
        }
        return input;
    }

    static String sonderZeichen(String s) {
        s = s.toLowerCase();
        s = s.replace("ä", "a");
        s = s.replace("ö", "o");
        s = s.replace("ü", "u");
        s = s.replace("ß", "s");
        return s;
    }

    static boolean escape(char c){
        return c == 'n' || c == 'r' || c == 'n' || c == 'b';
    }

    static int anzahlBuchstaben(String s){
        int anzahl = 0;
        s = sonderZeichen(s);
        for(int i = 0; i < s.length(); i++){
            if (i!= 0 && s.charAt(i - 1) == 92 && escape(s.charAt(i))) {
                    continue;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                anzahl++;
            }
        }
        return anzahl;
    }

    static int anzahlWorte(String s){
        int anzahl = 0;
        s = sonderZeichen(s);
        for(int i = 0; i < s.length(); i++){
            if (i != (s.length()-1)){
                if (s.charAt(i) == 32 && ((s.charAt(i+1) >= 'a' && s.charAt(i+1) <= 'z') || (s.charAt(i+1) == 92))) {
                    anzahl++;
                }
            } else {
                if ((s.charAt(i-1) >= 'a' && s.charAt(i-1) <= 'z') && (s.charAt(i-2) == 92)){
                    anzahl++;
                }
            }
        }
        return anzahl;
        //TODO: Berechnung der Worter bei EOL die mit . , oder sonstiges enden.
    }

    static int anzahlZeilen(String s){
        return 0;
    }

    static int worteMitChar(String s, char c){
        return 0;
    }

    static int wieOft(String s, String wort){
        return 0;
    }

    public static void main(String[] args) {
        String input = userInput();
        System.out.println(input);
        // anzahlBuchstaben(userInput());
        System.out.println(anzahlWorte(input));








    }
}
