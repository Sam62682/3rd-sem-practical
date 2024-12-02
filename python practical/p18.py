def access_string_elements(s):    
    print("Forward order:")
    for char in s:
        print(char, end=' ')
    
    print()  

    print("Backward order:")
    for char in reversed(s):
        print(char, end=' ')
    
    print()  

def main():
    user_input = input("Enter a string: ")
    access_string_elements(user_input)

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    main()