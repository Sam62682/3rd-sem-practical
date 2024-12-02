def demonstrate_string_casing(input_string):
    print("Original String: ", input_string)
    print("Lowercase: ", input_string.lower())
    print("Uppercase: ", input_string.upper())
    print("Title Case: ", input_string.title())
    print("Capitalized: ", input_string.capitalize())
    print("Swapcase: ", input_string.swapcase())

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    example_string = "hello, World! Welcome to Python Programming."
    
    demonstrate_string_casing(example_string)