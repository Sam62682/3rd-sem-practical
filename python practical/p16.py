def multiplication(n):
    for i in range(1, 11):
        print(n, "*", i, "=", n * i)

def main():
    n = int(input("Enter the value of n : "))
    multiplication(n)

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    main()