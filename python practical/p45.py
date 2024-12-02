def count_words_with_specific_letters(file_path):
    letters_to_check = {'w', 'o', 'r', 'd', 's'}
    count = 0
    try:
        with open(file_path, 'r', encoding='utf-8') as file:
            for line in file:
                words = line.split()
                for word in words:
                    if any(letter in word.lower() for letter in letters_to_check):
                        count += 1
    except FileNotFoundError:
        print(f"The file '{file_path}' was not found.")
        return
    except Exception as e:
        print(f"An error occurred: {e}")
        return

    print(f"Total number of words containing any of the letters {letters_to_check}: {count}")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    count_words_with_specific_letters('p45.txt')