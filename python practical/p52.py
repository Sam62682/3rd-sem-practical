class Point:
    def __init__(self, x, y):
        self.x, self.y = x, y

    def __str__(self):
        return f"Point({self.x}, {self.y})"

class Rectangle:
    def __init__(self, bottom_left: Point, width: float, height: float):
        self.bottom_left, self.width, self.height = bottom_left, width, height

    def area(self):
        return self.width * self.height

    def perimeter(self):
        return 2 * (self.width + self.height)

    def __str__(self):
        return f"Rectangle(bottom_left={self.bottom_left}, width={self.width}, height={self.height})"

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) – 3r Sem\n")
    x, y = float(input("Enter x: ")), float(input("Enter y: "))
    width, height = float(input("Enter width: ")), float(input("Enter height: "))
    
    rectangle = Rectangle(Point(x, y), width, height)
    
    print("\nRectangle Details:")
    print(rectangle)
    print(f"Area: {rectangle.area()}")
    print(f"Perimeter: {rectangle.perimeter()}")
