from random import Random

if __name__ != "__main__":

    class Kinosaal:
        kinosaal = []
        def __init__(self, rehien : int, sitze : int):
            sitz = "_"
            self.kinosaal = [[sitz for i in range(sitze)] for i in range(rehien)]

        def platz_belegung_aktualisieren(self, reihe : int, sitz : int, besetzen : bool):
            if besetzen and self.kinosaal[reihe][sitz] == 0:
                print("Sorry, Sitz ist bereits vergeben")
                print("Bitte einen anderen Sitz.")
                return -1
            elif besetzen:
                self.kinosaal[reihe][sitz] = 0
            else:
                self.kinosaal[reihe][sitz] = "_"

        def zufaellige_belegung(self, anzahl_sitze : int):
            zufalls_generator = Random()
            reihe = zufalls_generator.randint(0, len(self.kinosaal)-1)
            sitz = 0
            if anzahl_sitze > len(self.kinosaal[0]):
                print(f"Es können maximal {len(self.kinosaal[0])} Sitze zusammen"
                      f"reserviert werden.")
            else:
                freie_sitze = 0
                counter = len(self.kinosaal)
                while freie_sitze < anzahl_sitze:
                    counter -= 1
                    for item in self.kinosaal[reihe]:
                        freie_sitze += 1
                        if item == 0:
                            break
                    if freie_sitze < anzahl_sitze:
                        freie_sitze = 0
                        for item in reversed(self.kinosaal[reihe]):
                            freie_sitze += 1
                            if item == 0:
                                break
                    if freie_sitze < anzahl_sitze:
                        reihe += 1
                    else:
                        break
                    if reihe > len(self.kinosaal):
                        reihe = 1
                    if counter == 0:
                        print()

                for i in anzahl_sitze:
                    reserviert = True
                    while reserviert:
                        sitz = zufalls_generator.random(0, len(self.kinosaal[0]))
                        a = self.platz_belegung_aktualisieren(reihe, sitz, True)
                        if a != -1:
                            reserviert = False




        def kinosaal_bild(self):
            format_str = "{:^2}"
            sitzreihe = 0
            for reihe in self.kinosaal:
                sitzreihe += 1
                kinosaal_bild = "| " + str(sitzreihe) + " "
                if sitzreihe == int(len(self.kinosaal)/2):
                    format_str2 = "{:^" + str(len(self.kinosaal)) +"}"
                    gang = "durchgang"
                    print(format_str2.format(gang))
                for sitz in reihe:
                    kinosaal_bild += format_str.format(sitz)
                kinosaal_bild += " |"
                print(kinosaal_bild)
            print()

            leinwand = ""
            seiten = (len(self.kinosaal) - 8)/2
            for i in range(int(seiten)):
                leinwand += "/"
            leinwand += "Leinwand"
            for i in reversed(range(int(seiten)+9,len(self.kinosaal))):
                leinwand += "/"
            size = str(len(self.kinosaal))
            format_str = "{:^" + size + "}"
            print(format_str.format(leinwand))




else:
    print("Hier ist nur ein Modul, bitte gehe zum main und mach dort ein 'Run'")