import math


class Point:
    def __init__(self, x=0.0, y=0.0):
        self.__x = x
        self.__y = y

    def getx(self):
        return self.__x

    def gety(self):
        return self.__y

    def distance_from_xy(self, x, y):
        new_x = x - self.__x
        new_y = self.__y - y
        return math.hypot(new_x,new_y)

    def distance_from_point(self, point):
        new_x = point.getx() - self.__x
        new_y = self.__y - point.gety()
        return math.hypot(new_x,new_y)

if __name__ == "__main__":
    point1 = Point(0, 0)
    point2 = Point(1, 1)
    print(point1.distance_from_point(point2))
    print(point2.distance_from_xy(2, 0))

