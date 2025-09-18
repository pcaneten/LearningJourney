from tokenize import String

def find_word(word : String, text : String):
    word = word.lower()
    text = text.lower()
    ch_to_find = len(word)
    ch_found = 0
    for ch in word:
        repeated_ch_word = word.count(ch)
        repeated_ch_text = text.count(ch)
        if repeated_ch_word <= repeated_ch_text:
            if text.find(ch) > 0:
                ch_found += 1
        else:
            return "No"
    if ch_to_find == ch_found:
        return "Yes"

def find_word_2(word : String, text : String):
    word = word.lower()
    text = text.lower()
    for ch in word:
        if word.count(ch) > text.count(ch):
            return "No"
    return "Yes"

def find_word_in_order(word : String, text : String):
    word = word.lower()
    text = text.lower()
    ch_to_find = len(word)
    ch_found = 0
    position = 0
    for ch in word:
        text = text[position:]
        if text.find(ch) >= 0:
            position = text.find(ch)
            ch_found += 1
        else:
            return "No"
    if ch_to_find == ch_found:
        return "Yes"



word = input("Enter your the word to be found: ")
text = input("Enter the text where the word should be found: ")
print(find_word(word, text))
print(find_word_in_order(word, text))
print(find_word_2(word,text))




