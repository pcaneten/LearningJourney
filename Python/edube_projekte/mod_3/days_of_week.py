class WeekDayError(Exception):
    pass


class Weeker:
    __weekdays = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]

    def __init__(self, day):
        if day in self.__weekdays:
            self.__day = day
        else:
            raise WeekDayError

    def __str__(self):
        return self.__day

    def add_days(self, n):
        new_index = (self.__weekdays.index(self.__day) + n) % 7
        self.__day = self.__weekdays[new_index]



    def subtract_days(self, n):
        new_index = (self.__weekdays.index(self.__day) - n) % 7
        self.__day = self.__weekdays[new_index]



try:
    weekday = Weeker('Mon')
    print(weekday)
    weekday.add_days(15)
    print(weekday)
    weekday.subtract_days(23)
    print(weekday)
    weekday = Weeker('Monday')
except WeekDayError:
    print("Sorry, I can't serve your request.")