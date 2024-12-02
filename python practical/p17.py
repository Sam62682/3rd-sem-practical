def access_string_elements(s):
    
    print("Forward order:")
    index = 0
    while index < len(s):
        print(s[index], end=' ')
        index += 1
    
    print()

    
    print("Backward order:")
    index = len(s) - 1
    while index >= 0:
        print(s[index], end=' ')
        index -= 1
    
    print()

def main():
    user_input = input("Enter a string: ")
    access_string_elements(user_input)

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    main()