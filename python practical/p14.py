def factorial(n):
    if n < 0:
        return "Factorial is not defined for negative numbers."
    
    result = 1
    count = 1
    
    while count <= n:
        result *= count
        count += 1
        
    return result

def main():

    try:
        num = int(input("Enter a non-negative integer: "))
        fact = factorial(num)
        print(f"The factorial of {num} is: {fact}")
    except ValueError:
        print("Please enter a valid integer.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) 3rd Sem\n")
    main()