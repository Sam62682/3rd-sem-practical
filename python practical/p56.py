class Calculator:
    def add(self, *args):
        return sum(args)

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    calc = Calculator()
    result1 = calc.add(5, 10)
    print(f"Sum of 5 and 10 is: {result1}")
    result2 = calc.add(1, 2, 3)
    print(f"Sum of 1, 2, and 3 is: {result2}")
    result3 = calc.add(10, 20, 30, 40, 50)
    print(f"Sum of 10, 20, 30, 40, and 50 is: {result3}")