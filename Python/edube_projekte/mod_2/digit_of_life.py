from tokenize import String


def digit_life(birthdate : String):
    if not birthdate.isnumeric():
        print("Please only Enter numbers, accepted date formats are: ")
        print("YYYYMMDD, or YYYYDDMM, or MMDDYYYY")
        return
    else:
        while len(birthdate) != 1:
            digit_of_life = 0
            for num in birthdate:
                digit_of_life = int(digit_of_life) + int(num)
            birthdate = str(digit_of_life)
        print(digit_of_life)


digit_life("1542")