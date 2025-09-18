class StudentsDataException(Exception):
    pass


class BadLine(StudentsDataException):
    exit("Bad line")


class FileEmpty(StudentsDataException):
    exit("File is Empty")