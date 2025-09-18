class StudentsDataException(Exception):
    pass


class BadLine(StudentsDataException):
    def __init__(self, line_number, line_string):
        super().__init__(self)
        self.line_number = int(line_number)
        self.line_string = line_string


class FileEmpty(StudentsDataException):
    def __init__(self):
        super().__init__(self)

########################################################

document = input( "Enter student's data filename: " )
data = { }
line_number = 1

try:
    file = open(document, "rt")
    lines = file.readlines()
    file.close()

    if len(lines) == 0:
        raise FileEmpty

    for i in range(len(lines)):
        line = lines[i].split()
        if len(line) != 3:
            raise BadLine( i+1 , lines[i] )
        student = line[0] + " " + line[1]
        try:
            points = float(line[2])
        except ValueError:
            raise BadLine( i+1 , lines[i] )
        if student in data:
             points += data[student]
        data[student] = points

    for student in sorted(data.keys()):
        print(student, " "*4, data[student])
except IOError as e:
    print(e)
except BadLine as e:
    print("Bad line #" + str(e.line_number) + " in source file: "
          + document + " at line: " + e.line_string)