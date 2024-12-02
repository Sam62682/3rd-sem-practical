def fibonacci(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

def print_fibonacci_series(n):
    for i in range(n):
        print(fibonacci(i), end=' ')

def main():
    try:
        num_terms = int(input("Enter the number of terms for Fibonacci series: "))
        print(f"Fibonacci series up to {num_terms} terms: ")
        print_fibonacci_series(num_terms)
    
    except ValueError:
        print("Please enter a valid integer.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) 3rd Sem\n")
    main()