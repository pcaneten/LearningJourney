from tokenize import String

def str_to_int(modifier : String):
    if modifier.isnumeric():
        return int(modifier)
    else:
        print("Wrong modifier entered, only whole numbers expected")
        return

def crypting(text :String, modifier : int = 1):
    crypted_text = ""
    modifier = str_to_int(modifier)
    for ch in text:
        if ch.isalpha() and ch.isupper():
            ch = chr(ord(ch)+modifier)
            while( chr(ord(ch)) > 'Z'):
                ch = chr(ord(ch)-26)
        elif ch.isalpha() and ch.islower():
            ch = chr(ord(ch)+modifier)
            while( chr(ord(ch)) > 'z'):
                ch = chr(ord(ch)-26)
        crypted_text += ch
    print(crypted_text)



text = input("Enter your text: \n>>> ")
modifier = input("Enter a number for the value incrase: \n>>> ")


crypting(text, modifier)







