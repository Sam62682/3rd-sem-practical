def is_prime(num):

    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def print_primes_between(a, b):
    
    if a > b:
        a, b = b, a 

    print(f"Prime numbers between {a} and {b}:")
    for num in range(a + 1, b):
        if is_prime(num):
            print(num, end=' ')
    print()  
if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    print_primes_between(10, 50)