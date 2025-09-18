from calendar import Calendar

class MyCalendar(Calendar):

    def __init__(self, firstweekday=0):
        super().__init__(firstweekday)

    def count_weekdays_in_year( self, year : int, weekday : int):
        occurrence = 0
        month = 1
        if weekday not in range(7):
            raise ValueError
        while month <= 12:
            for data in self.monthdays2calendar(year, month):
                if data[weekday][0] != 0:
                    occurrence += 1
            month += 1
        return occurrence



mycal = MyCalendar()
days = mycal.count_weekdays_in_year(2000, 6)

print(days)
