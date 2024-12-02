print("Name : Sameer\nClass : M.Sc(IT) - 3rd sem\n")
num1 = int(input("Enter the number : "))
if num1 > 1:
    for i in range(2, num1):
        if num1 % i == 0:
            print(num1, "is not a prime number.")
            break
        else:
            print(num1, "is prime number.")
            break
else:
    print(num1, "is not a prime number.")
