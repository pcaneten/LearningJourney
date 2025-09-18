class Timer:
    __hours = 0
    __minutes = 0
    __seconds = 0

    def __init__(self, hours : int = 0, minutes : int = 0, seconds : int = 0):
        self.__set_hours(hours)
        self.__set_minutes(minutes)
        self.__set_seconds(seconds)

    def __str__(self):
        timer = f"{self.__hours}:{self.__minutes}:{self.__minutes}"
        timer = timer.replace("0", "00")
        return timer

    def __set_hours(self, hours : int):
        self.__hours += hours
        self.__hours = self.__hours % 24

    def __set_minutes(self, minutes : int):
        self.__minutes += minutes
        self.__set_hours(self.__minutes // 60)
        self.__minutes = self.__minutes % 60

    def __set_seconds(self, seconds : int):
        self.__seconds += seconds
        self.__set_minutes(self.__seconds // 60)
        self.__seconds = self.__seconds % 60

    def next_second(self):
        self.__set_seconds(1)

    def prev_second(self):
        self.__set_seconds(-1)


timer = Timer(23, 59, 59)
print(timer)
timer.next_second()
print(timer)
timer.prev_second()
print(timer)