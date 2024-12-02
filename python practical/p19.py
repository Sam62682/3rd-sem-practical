def check_substring(main_string, substring):
    if substring in main_string:
        return True
    else:
        return False

def main():
    main_string = input("Enter the main string: ")
    substring = input("Enter the substring to search for: ")
    
    if check_substring(main_string, substring):
        print(f"The substring '{substring}' exists in the main string.")
    else:
        print(f"The substring '{substring}' does not exist in the main string.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    main()