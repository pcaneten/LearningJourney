import string
from random import Random
from time import sleep

if __name__ != "__main__":
    # Funktion fuer die Lehrzeilen, default eine Lehrzeile

    def spacing_sleep(lehrzehilen = 1, sekunden = 0.5):
        for i in range(lehrzehilen):
            print()
        sleep(sekunden)


    schwierigkeits_grad : int = 10


    # Eingabefunktion um den escape abzufangen.

    def eingabe():
        try:
            a = input("#>>> ").lower()
            if a == "q":
                spacing_sleep(3)
                print(f"Ok {__name}! Ich wunsche dir noch einen Wunderschönen Tag!")
                return exit(0)
            else:
                return a
        except KeyboardInterrupt:
            spacing_sleep()
            return exit("Schönen Tag Noch!")

    # Funtkion um ein Strings fuer die Aufgabe zu generieren.
    # Ubergabe von Liste und symbol ( +, -, * oder / ) erwartet.
    # String als return.

    def string_generator(to_string : list, berechnungsart : string):
        ausgabe_string = ""
        for i in range(len(to_string)):
            ausgabe_string += str(to_string[i])
            if i < (len(to_string)-1):
                ausgabe_string += berechnungsart
            else:
                ausgabe_string += " = ??"
        return ausgabe_string

    # Begruesungsfunktion mit Namens abfrage als globale variable ( __name )

    def begruesung():
        spacing_sleep(3,1)
        print("Hallöchen! Hier dein MatheBot!")
        spacing_sleep(2)
        print("Wie heißt du?")
        global __name
        __name = input("#>>> ").capitalize()
        spacing_sleep(2,1)
        print(f"Guten Tag {__name}!!")
        spacing_sleep(1,1)
        print("Willkommen zu unserem Mathe-Rate-Spiel")
        spacing_sleep(1,1)

    # Ausgabe der Auswahlmoeglichkeit zwischen Addition( + ), Subtraktion( - ),
    # Multiplikation ( * ) oder Division ( / )
    # Als return eine input Anfrage

    def art_berechnung():
        spacing_sleep(1)
        print("Lass uns mit der Art der Berechnung anfangen!")
        spacing_sleep()
        print("Bitte wähle aus folgenden Optionen:")
        spacing_sleep(1,1)
        print("A : Addition")
        sleep(0.5)
        print("B : Substraktion")
        sleep(0.5)
        print("C : Multiplikation")
        sleep(0.5)
        print("D : Division")
        spacing_sleep()
        print("Q : Quit")
        return eingabe()


    # Auswertung der Berechnungsart auswahl und entsprechende print ausgabe
    # Als return gibt es ein String als Berechnungsart

    def auswahl_1():
        keine_auswahl = True
        a = art_berechnung().lower()
        while keine_auswahl:
            if a == "a":
                spacing_sleep(2,1)
                print("Die Addition wird ausgeführt, nur noch ein paar Fragen.")
                break
            elif a == "b":
                spacing_sleep(2,1)
                print("Die Substraktion wird ausgeführt, nur noch ein paar Fragen.")
                break
            elif a == "c":
                spacing_sleep(2,1)
                print("Die Multiplikation wird ausgeführt, nur noch ein paar Fragen.")
                break
            elif a == "d":
                spacing_sleep(2,1)
                print("Die Division wird ausgeführt, nur noch ein paar Fragen.")
                break
            else:
                spacing_sleep(2,1)
                print(f"WTF? Also, {__name}! Es wird eine A, B, C, D oder Q erwartet,"
                      f" lass uns nochmal probieren")
                a = art_berechnung()
        return a

    # Ausgabe der Auswahlmoeglichkeit des Schwierigkeitsgrades,
    # ob zahlen von 1 bis 100, 1.000, 10.000 oder 1 Million
    # Als return eine input Anfrage

    def schwierigkeits_grad():
        spacing_sleep(3,1.2)
        print(f"{__name}, jetzt kannst du den Schwierigskeitgrad auswahlen: ")
        spacing_sleep(1,1)
        print("E : Einfach, ich möchte mich erstmal reinschnuppern.")
        sleep(0.5)
        print("M : Mittel, ich fühl mich wohl mit Mathe.")
        sleep(0.5)
        print("F : Fortgeschritten, ich habe keine Angst und möchte etwas herausforderung.")
        sleep(0.5)
        print("G : Ich bin ein MATHE GOT!!!!")
        spacing_sleep()
        print("Q : Quit. Keine Lust, schalte mal aus!")
        return eingabe()

    # Auswertung des Schwierigkeitsgrades und entsprechende print ausgabe
    # Als return ein int fuer den maximal range des randint

    def auswahl_2():
        a = schwierigkeits_grad()
        keine_auswahl = True
        while keine_auswahl:
            spacing_sleep(3)
            if a == "e":
                print(f"Gut, {__name}, deine Aufgabe wird mit Zahlen "
                      f"von 1 bis 10 durchgeführt.")
                return 10
            elif a == "m":
                print(f"Gut, {__name}, deine Aufgabe wird mit Zahlen "
                      f"von 1 bis 100 durchgeführt.")
                return 100
            elif a == "f":
                print(f"Gut, {__name}, deine Aufgabe wird mit Zahlen "
                      f"von 1 bis 1.000 durchgeführt.")
                return 1000
            elif a == "g":
                print(f"Gut, {__name}, deineAufgabe wird mit Zahlen "
                      f"von 1 bis 1.000.000 durchgeführt.")
                return 1000000
            else:
                print(f"WTF? Also, {__name}! Eine E, M, F, G oder Q wird erwartet, "
                      f"versuch nochmal!")
                a = schwierigkeits_grad()

    # Ausgabe Auswahlmoeglichkeit der Anzahl der Zahlen die Berechnet werden
    # Als return gibt es ein int fuer die Anzahl der Zahlen

    def auswahl_3():
        spacing_sleep(3,1.2)
        auswahl = True
        while auswahl:
            print(f"{__name}, deine letzte Chance! Jetzt kannst du die Anzahl"
                  f" der berechnungen auswahlen (2 bis 10): ")
            spacing_sleep()
            print("Oder Q : Für quit! Ist einfach zu viel. Du möchtest einfach auschalten!")
            sleep(0.5)
            auswahl3 = eingabe()
            try:
                auswahl3 = int(auswahl3)
                if auswahl3 >= 2 and auswahl3 <= 10:
                    return auswahl3
                else:
                    print("Falsche Eingabe. Bitte nur zahlen zwischen 2 bis 10 oder Q.")
            except:
                print("Falsche Eingabe. Bitte nur zahlen zwischen 2 bis 10 oder Q.")
            spacing_sleep()


    #######################################################################
    ## Funktionen fuer die generierung der Zahlen und print der Aufgabe, ##
    #########           so wie der Ergebniss als return          ##########
    #######################################################################

    # Additionsfunktion. Die Zahlen werden einfach addiert.

    def addition(schwierigkeit : int, anzahl_zahlen: int):
        addition = 0
        zahlen = []
        zahlen_generator = Random()
        for i in range(anzahl_zahlen):
            a = zahlen_generator.randint(1,schwierigkeit)
            zahlen.append(a)
            addition += a
        print(zahlen)
        zahlen = string_generator(zahlen, " + ")
        print(zahlen)
        return addition

    # Substraktionsfunktion. Die Zahlen werden den Wert des
    # (Schwierigkeitsgrades * Anzahl der Zahlen + Randint) substraiert.

    def substraktion(schwierigkeit : int, anzahl_zahlen: int):
        zahlen_generator = Random()
        substraktion = (schwierigkeit  * anzahl_zahlen + \
                        zahlen_generator.randint(1,schwierigkeit))
        zahlen = [substraktion]
        for i in range(anzahl_zahlen-1):
            a = zahlen_generator.randint(1,schwierigkeit)
            zahlen.append(a)
            substraktion -= a
        print(string_generator(zahlen, " - "))
        return substraktion

    # Multiplikationsfunktion. Die Zahlen werden miteinander multipliziert.

    def multiplikation(schwierigkeit : int, anzahl_zahlen: int):
        multiplikation = 0
        zahlen = []
        zahlen_generator = Random()
        for i in range(anzahl_zahlen):
            a = zahlen_generator.randint(1,schwierigkeit)
            zahlen.append(a)
            multiplikation *= a
        zahlen = string_generator(zahlen, " * ")
        print(zahlen)
        return multiplikation

    #############################################################
    ######## Aufgabe- und Loesungsfunktionem des Spieles ########
    #############################################################

    # Divisionsfunktion. Die Zahlen werden den Wert des
    # (Schwierigkeitsgrades * Anzahl der Zahlen + Randint) in reienfolge dividiert.

    def division(schwierigkeit : int, anzahl_zahlen: int):
        zahlen_generator = Random()
        division = schwierigkeit  * anzahl_zahlen + \
                   zahlen_generator.randint(1,schwierigkeit)
        zahlen = [division]
        for i in range(anzahl_zahlen-1):
            a = zahlen_generator.randint(1,schwierigkeit)
            zahlen.append(a)
            division /= a
        zahlen = string_generator(zahlen, " / ")
        print(zahlen)
        return division

    #Aufgabefunktion, generierung und Ausgabe der Aufgabe.
    #Als return gibt es das Ergebniss der Aufgabe

    def aufgabegenerierung(berechungsart : string, schwierigkeit : int, anzahl_zahlen : int):
        spacing_sleep(2)
        print("Hier die zufällig generierte Aufgabe:")
        spacing_sleep()
        loesung = 0
        if berechungsart == "a":
            loesung = addition(schwierigkeit, anzahl_zahlen)
        elif berechungsart == "b":
            loesung = substraktion(schwierigkeit, anzahl_zahlen)
        elif berechungsart == "c":
            loesung = multiplikation(schwierigkeit, anzahl_zahlen)
        elif berechungsart == "d":
            loesung = division(schwierigkeit, anzahl_zahlen)
        spacing_sleep()
        print("Möchtest du den Ergebniss raten?")
        print("Wenn nicht, hast du immer die Q als wegrenn Option! ;)")
        return loesung

    # Loesungsvergleich und auswertung der Versuche

    __anzahl_versuche = 0
    __anzahl_richtige_loesungen = 0

    def loesungsvergleich(loesung : int):
        richtige_losung = False
        global __anzahl_richtige_loesungen
        global __anzahl_versuche
        __anzahl_versuche += 1
        a = eingabe()
        while not richtige_losung:
            try:
                a = float(a)
                spacing_sleep(2)
                richtig = True
                if a == loesung:
                    __anzahl_richtige_loesungen += 1
                    print(f"Hurra {__name}!!! Du hast es Richtig gemacht!!")
                    print(f"Du hast {__anzahl_richtige_loesungen} "
                          f"von {__anzahl_versuche} versuche Richtig geantwortet")
                    spacing_sleep()
                    print("Möchtest du nochmal spielen?")
                else:
                    print(f"Schade {__name}, leider noch nicht geschaft!")
                    spacing_sleep()
                    print("Möchtest du weiter ausprobieren?")
                    richtig = False
                spacing_sleep()
                weiterspielen(loesung, richtig)
                richtige_losung = True
            except:
                spacing_sleep()
                print("Falsche Eingabe. Bitte nur Zahlen oder Q.")

    #Funktion zum Weiterspielen oder nochmal versuchen.

    def weiterspielen(loesung : int, richtig : bool):
        if richtig:


            print("Beliebige Eingabe um einen neuen Spielen zu starten, "
                  "oder Q um alles zu beenden!")

            weiter = eingabe()
            return spiel_start(False)



        else:
            print("Beliebige Eingabe um einen neuen Spielen zu starten, "
                  "J nochmal zu probieren oder Q um alles zu beenden!")
            weiter = eingabe()
            if weiter == "j":
                spacing_sleep()
                print("Ok! Versuche nochmal: ")
                return loesungsvergleich(loesung)
            else:
                return spiel_start(False)

    ############################################
    ######## Haupt funktion des Spieles ########
    ############################################

    def spiel_start(mit_begruesung = True):
        if mit_begruesung:
            begruesung()
        berechungsart = auswahl_1()
        schwierigkeit = auswahl_2()
        anzahl_zahlen = auswahl_3()
        loesung = aufgabegenerierung(berechungsart, schwierigkeit, anzahl_zahlen)
        loesungsvergleich(loesung)

else:
    print("This is a module, please run main file")



    #elif a == "q":
    #   spacing_sleep(3,1)
    #   exit(f"Ok {__name}! Wunsche dir einen Wunderschönen Tag!")