# Einfacher Waehrungs-Rechner
# User gibt eine Waehrung ein (Euro, USD oder GBP) und diese wird
# in der Whalwaehrung umgerechnet.

eur_usd = 1.11
eur_gbp = 0.83
usd_eur = 0.9
usd_gbp = 0.75
gbp_eur = 1.2
gbp_usd = 1.33
waechselkurs = 0

waehrung1 = input("Bitte gib eine Währung ein (EUR, USD oder GBP): ").upper()
waehrung2 = input("Bitte gib die umrechnungs Währung ein (EUR, USD oder GBP): ").upper()

if waehrung1 == "EUR":
    if waehrung2 == "USD":
        waechselkurs = eur_usd
    else:
        waechselkurs = eur_gbp
elif waehrung1 == "USD":
    if waehrung2 == "EUR":
        waechselkurs = usd_eur
    else:
        waechselkurs = usd_gbp
elif waehrung1 == "GBP":
    if waehrung2 == "EUR":
        waechselkurs = gbp_eur
    else:
        waechselkurs = gbp_usd
else:
    exit("WHAAAT?")

print(f"Der akutelle Wächselkurs ist 1 {waehrung1} sind {waechselkurs} {waehrung2}")
wert1 = int(input(f"Bitte gib die Summe der {waehrung1} ein: "))
wert2 = int(input(f"Bitte gib die Summe der {waehrung2} ein: "))

print(f"{wert1} {waehrung1} sind aktuell {wert2*waechselkurs} {waehrung2}")
