def factorial(num):
    if num == 0 or num == 1:
        return 1
    else:
        return num * factorial(num - 1)

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    num = int(input("Enter a number : "))
    fac = factorial(num)
    print(f"The factorial of {num} is : {fac}")