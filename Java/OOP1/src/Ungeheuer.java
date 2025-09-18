public class Ungeheuer {

    private int leben;
    private String name;

    /*
    * new: 3 Aufgaben
    * 1. alloziiere (anfordern vom BS) Platz für das Objekt
    * 2. rufe den Konstruktor, der das Ordener der innere Struktur (MemberVariablen)
    * und die Initialisierung vornimmt (Erstuweisung) vornimmt
    * 3. werfe die Adresse des gebauten Objektes zurück
    *
    * Ders Zuweisungsoperator kann dan die Referenez damit initialisieren
    *
     */

    /*
    Der Kosntrukutor ist immer da. Wenn ihr ihn nicht hinschreibt, gibt es immer einen Default Konstruktor.
    Wenn ihr einen hinschreibt, ist der Default Konstruktor weg, und eurer wird genutzt
    Der Kosntruktor ist für die Initialisierung der Membervariablen zuständig, man kann ihn auch für weitere Aufgaben nutzen,
    beisplielsweise zum öffnen von Dateien doer Datenbanken etc.

    Der Konstruktor in Java Heisst wie die Klasse, und hat NIEMALS einen Datentyp des Rückgabewertes.
    */

    /*
    * Überladen von Funktionen, Methoden oder Kosntruktoren:
    *
    * Funktionsname mus gleich sein, aber
    * die Parameteranzahl und/oder der Parametertyp müssen unsterschiedlich sein
     */

    public Ungeheuer(String name){
        this.name = name;
        setLeben(100);
        System.out.println("String only Konstruktor");
    }

    public Ungeheuer(String name, int leben){
        this.name = name;
        setLeben(leben);
        System.out.println("String und int Konstruktor");
    }

    public String getName(){
        return this.name;
    }

    public void setLeben(int leben){
        this.leben = leben;
    }
    public int getLeben(){
        return this.leben;
    }

    public void bruelle(){
        System.out.println("Rooooaaaaarrr!!!");
    }

    public void getUngeheuerInfo(){
        System.out.println("Name: " + getName() + " Leben: " + getLeben());
        System.out.println("THIS, Ort im Speicher: " + this);
    }
}
