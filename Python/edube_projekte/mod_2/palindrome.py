from tokenize import String

def palindrome(text: String):
    palindrome = False
    right = len(text) - 1
    left = 0
    while left < right:
        if not text[left].isalpha():
            left += 1
        if not text[right].isalpha():
            right -= 1
        print(text[left], ord(text[left]), " and ", text[right], ord(text[right]), sep="\t")
        if ord(text[left]) == ord(text[right]):
            palindrome = True
            left += 1
            right -= 1
        else:
            palindrome = False
            break
    if palindrome:
        print("It's a palindrome")
    else:
        print("It's not a palindrome")

text = input("Enter your text here: ").lower()
palindrome(text)



