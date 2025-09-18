
if __name__ != "__main__":
    from .points_on_plane import Point
else:
    from points_on_plane import Point

"""
class Point:
    pass
"""


class Triangle:
    def __init__(self, vertice1, vertice2, vertice3):
        self.__vertice1 = Point(vertice1.getx(), vertice1.gety())
        self.__vertice2 = Point(vertice2.getx(), vertice2.gety())
        self.__vertice3 = Point(vertice3.getx(), vertice3.gety())

    def perimeter(self):
        side1 = self.__vertice1.distance_from_point(self.__vertice2)
        side2 = self.__vertice2.distance_from_point(self.__vertice3)
        side3 = self.__vertice3.distance_from_point(self.__vertice1)
        perimeter = side1 + side2 + side3
        return perimeter


triangle = Triangle(Point(0, 0), Point(1, 0), Point(0, 1))
print( "Perimeter:", triangle.perimeter())
