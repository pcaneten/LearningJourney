#imports

from random import Random
from sys import excepthook, exception
from time import sleep

#Funktionen

def string_generator(liste : list):
    ausgabe_string = ""
    for i in range(len(liste)):
        ausgabe_string += str(liste[i])
        if i < (len(liste) - 1):
            ausgabe_string += ", "
    return ausgabe_string

def plus_linie():
    print("+"*50)

def leerzeihlen(anzahl):
    for i in range(anzahl):
        print()

#Variablen block

lotto_ergebniss = []
lotto_zahlen_zieher = Random()
lotto_nummern = []
treffer = 0
treffer_zahlen = []

#Spielregeln print:

leerzeihlen(5)
plus_linie()
print("Willkommen zum Lotto-Spiel!!")
plus_linie()
sleep(0.5)
leerzeihlen(4)
print("Du Spielst 6 aus 49. Die Regeln sind wie folgt:")
sleep(1)
leerzeihlen(2)
print("1.- Du wählst 6 Zahlen von 1 bis 49 aus.")
sleep(1)
leerzeihlen(1)
print("2.- Jede Zahl kann nur Einmal gewählt werden.")
sleep(1)
leerzeihlen(1)
print("3.- Danach werden die Gewinnerzahlen automatisch gezogen.")
sleep(1)
leerzeihlen(1)
print("4.- Je mehr Treffer du hast, je mehr is der Gewinn!")
leerzeihlen(2)
sleep(2)
print("Viel Glück")
sleep(1)
leerzeihlen(5)

#Das Auswhaelen der Zahlen

while len(lotto_nummern) < 6:
    try:
        zahl = int(input(f"Feld {len(lotto_nummern)+1} - Bitte gib eine Zahl 1 bis 49 für ein: "))
        if zahl in lotto_nummern:
            print("Die Zahlen durfen sich nicht wiederholen.")
        elif zahl < 1 or zahl > 49:
            print("Bitte nur Nummern zwischen 1 und 49.")
        else:
            lotto_nummern.append(zahl)
    except ValueError:
        print("Bitte nur Nummern zwischen 1 und 49 und keine wiederholungen")
    except KeyboardInterrupt:
        print()
        exit("Schönen Tag!")

#Das Ziehen der Lotto-Zahlen

leerzeihlen(2)
print("Die Zahlen werden gezogen")
while len(lotto_ergebniss) < 6:
    zahl = lotto_zahlen_zieher.randint(1,49)
    if not zahl in lotto_ergebniss:
        lotto_ergebniss.append(zahl)
        sleep(1)
        print(f"Zahl {len(lotto_ergebniss)} ist: {zahl}")

#Ausgabe und sortierung der listen

lotto_nummern.sort()
lotto_ergebniss.sort()
sleep(2)
leerzeihlen(2)
print(f"Ihre Lotto Zahlen sind: {string_generator(lotto_nummern)}")
sleep(2)
leerzeihlen(2)
print("Die Gewinnerzahlen sind:", string_generator(lotto_ergebniss))
sleep(2)

#Treffer schleife

for deine_zahl in lotto_nummern:
    if deine_zahl in lotto_ergebniss:
        treffer_zahlen.append(deine_zahl)
treffer = len(treffer_zahlen)

#Treffer ergebnisse:

leerzeihlen(2)
if treffer == 0:
    print("Schade... du hast keinen Treffer")
elif treffer == 1:
    print("Uiii!! du hast 1 Treffer")
    sleep(1)
    print("Schade.... du gewinnst garnichts!")
elif treffer == 2:
    print("Uiii!! du hast 2 Treffer")
    sleep(1)
    print("Fast was gewonnen, aber nur FAST!")
elif treffer == 3:
    print("Uiii!! du hast 3 Treffer")
    sleep(1)
    print("Denkste jetzt gibts Köhle? Viel Glück!")
elif treffer == 4:
    print("Mehr als die Hälfte!! du hast 4 Treffer")
    sleep(1)
    print("Hier ein smiley :D")
elif treffer == 5:
    print("Fast geschaft!! du hast 5 Treffer")
    sleep(1)
    print("Kauf dir ein Burger welcher ist dir überlassen, du bezahlst es auch selbst")
else:
    print("Super du hast 6 Treffer!!!")
    sleep(1)
    print("WoW und dass bei ein Fake-Spiel... hast deine 1 in 14 Millionen Chance verspielt!")
leerzeihlen(1)
if treffer == 1:
    print("Deine Treffer Zahl:", string_generator(treffer_zahlen))
elif treffer > 1:
    print("Deine Treffer Zahlen:", string_generator(treffer_zahlen))

sleep(2)
fussnote = """
Die Ziehung der Loto-Zahlen erfolgt ohne Gewähr.
Beschwerden bitte an folgende Adresse:

Deutsche Lotto-Gesellschaft e.V.
Die Dummestraße 42
8545 Dummerland
"""
leerzeihlen(5)
print(fussnote)