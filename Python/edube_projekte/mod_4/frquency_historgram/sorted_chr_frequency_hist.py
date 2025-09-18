file = input("Enter the name of the file to analyze: ")

#A dictionary with all letters a to z and each with 0 counter is generated.
counters  = { chr(ch) : 0 for ch in range(ord('a'),ord('z')+1)}

try:
    content = open(file, "rt", encoding = "UTF-8")
    for ch in content.read():
        if ch.isalpha():
            counters[ch.lower()] += 1
    content.close()
    # Dictionary is created by sorting the previous dictinary based on their values
    # instead of key. For this, we use method items() in the sorted() method and
    # as key for the sorted() we set a lamda function indicating the value is to be used
    # reverse is set to True to have descending order.
    sorted = {
        key : value for key, value in sorted(
            counters.items(),
            key = lambda item: item[1],
            reverse=True)
    }
    # We remove any .XX from the file name to change it with .hist
    histogram_file = file[0:file.find(".")] + ".hist"

    file = open(histogram_file, "wt+", encoding = "UTF-8")
    for key in sorted:
        if sorted[key] != 0:
            file.write(key + " -> " + str(sorted[key]) + "\n")
    file.close

except IOError as e:
    print(e)

