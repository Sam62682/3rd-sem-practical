def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return abs(a * b) // gcd(a, b)

def main():
    
    try:
        num1 = int(input("Enter the first integer: "))
        num2 = int(input("Enter the second integer: "))
        
        
        gcd_result = gcd(num1, num2)
        lcm_result = lcm(num1, num2)
        
        
        print(f"The GCD of {num1} and {num2} is: {gcd_result}")
        print(f"The LCM of {num1} and {num2} is: {lcm_result}")
        
    except ValueError:
        print("Please enter valid integers.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) 3rd Sem\n")
    main()