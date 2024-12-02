print("Name : Sameer\nClass : M.Sc(IT) - 3rd sem\n")
str = input("Enter the number : ")
try:
    no = float(str)
    print(str, "is a valid decimal number.")
except ValueError:
    print(str, "is not a valid decimal number.")