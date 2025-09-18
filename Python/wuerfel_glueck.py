"""
Wuerfel spiel
Erst Spiler wuerfelt (1 bis 6)
Dann entweder Spieler 1 oder Rechner wuerfelt (1 bis 6)
ergebnis wird verglichen
"""
from random import Random
from time import sleep

wuerfel = Random()
spieler = ["Rechner"]
beste_zahl = 0
gewinner = []

print("Wilkommen im Wüerfel Spiel.")
sleep(1)
print("Jeder Spieler würfelt von 1 bis 6")
sleep(1)
print("Der Rechner Spielt mit")
sleep(1)

print()

try:
    anzahl_spieler = int(input("Bitte die Anzahl der zusätzlichen Spieler (1 bis 10) eintragen: "))
    while anzahl_spieler > 10 or anzahl_spieler <= 0:
        anzahl_spieler = int(input("Bitte die Anzahl der Spieler mindestens 1 und maximal 10 eintragen: "))


    print()

    for i in range(anzahl_spieler):
        spieler.append(input(f"Name des Spielers {i+1} eintragen: "))

    print("Die eingetragenen Spieler sind:")
    for i in spieler:
        print(i)
        sleep(0.5)

    print()

    for i in range(len(spieler)):
        spieler[i] = [spieler[i], wuerfel.randint(1,6)]
        print(f"{spieler[i][0]} hat eine {spieler[i][1]} gewürfelt")
        sleep(1)

    for i in range(len(spieler)):
        if spieler[i][1] > beste_zahl:
            beste_zahl = spieler[i][1]

    for i in range(len(spieler)):
        if spieler[i][1] == beste_zahl:
            gewinner.append(spieler[i][0])

    print()
    print()

    if len(gewinner) == len(spieler):
        print(f"Unentschieden, neu Spielen!")
    elif len(gewinner) == 1:
        gewinner_string = ""
        gewinner_string = gewinner[0]
        print(f"Der gewinner ist: {gewinner_string} mit einer {beste_zahl}!!")
        print("Hurra!")
    else:
        gewinner_string2 = ""
        for i in range(len(gewinner)):
            gewinner_string2 += gewinner[i]
            if i < (len(gewinner)-2):
                gewinner_string2 += ", "
            elif i == (len(gewinner)-2):
                gewinner_string2 += " und "
        print(f"Die gewinner sind: {gewinner_string2} mit einer {beste_zahl}!!")

except BaseException as e:
    print()
    print("Bitte nur Zahlen eingeben (zB. 1). Spiel neustarten")