def find_first_occurrence(main_string, substring):
    index = main_string.find(substring)
    if index != -1:
        print(f"The first occurrence of '{substring}' in '{main_string}' is at index: {index}")
    else:
        print(f"The substring '{substring}' was not found in '{main_string}'.")

def main():
    main_string = input("Enter the main string: ")
    substring = input("Enter the substring to find: ")
    find_first_occurrence(main_string, substring)

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    main()