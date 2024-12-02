def main():
    filename = "words.txt"
    
    with open(filename, 'w') as file:
        print("Enter words to write to the file. Type 'quit' to stop.")
        
        while True:
    
            word = input("Enter a word: ")
            
    
            if word.lower() == 'quit':
                print("Exiting the program.")
                break
            
            else:
                file.write(word + '\n')
                print(f"'{word}' has been written to the file.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    main()