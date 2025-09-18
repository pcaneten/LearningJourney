from tokenize import String

def anagram(text_1 : String, text_2 : String):
    text_1 = text_1.lower().split()
    text_2 = text_2.lower().split()
    anagram = True
    if len(text_1) != len(text_2):
        return anagram_print(False)
    else:
        for i in range(len(text_1)):
            for ch in text_1[i]:
                if ch in text_2[i]:
                    anagram = True
                else:
                    return anagram_print(False)
    return anagram_print(True)


def anagram_print( anagram : bool ):
    if anagram:
        print("Anagrams")
    else:
        print("Not anagrams")


def anagram_2(text_1 : String, text_2 : String): # Not working yet
    text_1 = text_1.lower().split()
    text_1.sort()
    text_2 = text_2.lower().split()
    text_2.sort()
    anagram = False
    if len(text_1) != len(text_2):
        print("Not anagrams")
        return
    for ch in text_1:
        if ch not in text_2:
            print("Not anagrams")
            return
        else:
            anagram = True
    return anagram_print(anagram)




text_1 = "listen"
text_2 = "silent"

anagram_2(text_1, text_2)

