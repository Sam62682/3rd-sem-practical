print("Name : Sameer\nClass : M.Sc(IT) - 3rd sem\n")
num1 = int(input("Enter the year : "))
if ((num1 % 4 == 0 and num1 % 100 != 0) or (num1 % 400 == 0)):
    print(num1, "is a leap year.")
else:
    print(num1, "is not a leap year.")