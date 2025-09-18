from tokenize import String

line = [True, True, True]
right_left = [True, False, True]
right = [False, False, True]
left = [True, False, False]
empty = [False, False, False]

dict_numbers = {
    "0":[line, right_left, right_left, right_left, line],
    "1":[right, right, right, right, right],
    "2":[line, right, line, left, line],
    "3":[line, right, line, right, line],
    "4":[right_left, right_left, line, right, right],
    "5":[line, left, line, right, line],
    "6":[line, left, line, right_left, line],
    "7":[line, right, right, right, right],
    "8":[line, right_left, line, right_left, line],
    "9":[line, right_left, line, right, line],
    "-":[empty, empty, line, empty, empty],
    "space":[False, False, False, False, False]
}

nmbrs = "16-69964"

line_1 = ""
line_2 = ""
line_3 = ""
line_4 = ""
line_5 = ""
output_lines = [line_1, line_2, line_3, line_4, line_5]

if type(nmbrs) == int:
    nmbrs = str(nmbrs)

for number in nmbrs:
    number_list = dict_numbers[number]
    for i in range(len(number_list)):
        for statement in number_list[i]:
            if statement:
                output_lines[i] += "#"
            else:
                output_lines[i] += " "
        output_lines[i] += "\t"

for line in output_lines:
    print(line)

line_2.isspace()