file_name = input("Enter the name of the file to open: ")
try:
    document = open(file_name, "rt")
    student = {}
    file = document.readline()
    while file != '':
        line = file.split()
        if len(line) != 0:
            student_key = line[0] + line[1]
            student_value = float(line[2])
            if student_key in student:
                student[ student_key ] += student_value
            else:
                student.update( { student_key : student_value } )
        file = document.readline()

except IOError as e:
    print(e)