from tokenize import String

lst = [
    295743861,
    431865927,
    876192543,
    387459216,
    612387495,
    549216738,
    763524189,
    928671354,
    154938627
]

def layout(lst):
    separator = "-"*27
    field = "| X X X |"*3
    column = [field, field, field]
    print(separator)
    counter = 3
    start = 0
    stop = 3
    while counter != 0:
        for i in range(start, stop):
            for item in column:
                line = str(lst[i])
                for numb in line:
                    item = item.replace("X", str(numb), 1)
            print(item)
        print(separator)
        counter -= 1
        start = stop
        stop += 3








layout(lst)

def sudoku(lst : list):
    sudoku_lst = []
    if len(lst) != 9:
        print("The input is incomplete, it should have 9 lines.")
        return "No"
    for line in lst:
        line = list(str(line))
        sudoku_lst.append(line)
        if len(line) != 9:
            print("The input is incomplete, each line should have 9 digits each")
            return "No"
        for item in line:
            if line.count(item) != 1:
                print("Each number from 1 to 9 can only appear once per line")
                return "No"
    for i in range(9):
        column = []
        for j in range(9):
            column.append(sudoku_lst[j][i])
        for numb in column:
            if column.count(numb) != 1:
                print("Each number from 1 to 9 can only appear once per column")
                return "No"
    return "Yes"

print(sudoku(lst))