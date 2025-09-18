from os import strerror

try:
    file = open(input("Give the name of the file you want to open: "), "rt")
    content = file.read()
    file.close()

    histogram = ""

    for i in range(ord("a"),ord("z")+1):
        ch = chr(i)
        frequency = content.count(ch) + content.count(ch.upper())
        histogram += ch + " -> " + str(frequency) + "\n"

    with open("results.txt", "wt", encoding ="UTF-8") as file:
        file.write(histogram)

except IOError as e:
    print(strerror(e.errno))
    print(e)
    print(e.errno)


