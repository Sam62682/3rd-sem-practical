def count_letters(input_string):
    letter_count = {}

    input_string = input_string.lower()

    for char in input_string:

        if char.isalpha():
    
            if char in letter_count:
                letter_count[char] += 1
            else:
                letter_count[char] = 1

    return letter_count

def main():
    input_string = input("Enter a string: ")
    
    letter_counts = count_letters(input_string)
    
    print("\nLetter occurrences:")
    for letter, count in letter_counts.items():
        print(f"{letter}: {count}")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    main()