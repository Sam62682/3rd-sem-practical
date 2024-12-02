def demonstrate_string_testing_methods(input_string):
    print(f"Testing the string: '{input_string}'")
    print("isalpha(): ", input_string.isalpha())
    print("isdigit(): ", input_string.isdigit())
    print("isalnum(): ", input_string.isalnum())
    print("isspace(): ", input_string.isspace())
    print("islower(): ", input_string.islower())
    print("isupper(): ", input_string.isupper())
    print("istitle(): ", input_string.istitle())
    print("\n")

if __name__ == "__main__":

    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

    test_strings = [
        "HelloWorld",
        "12345",
        "Hello123",
        "   ",
        "hello",
        "HELLO",
        "Hello World"
    ]

    for test_string in test_strings:
        demonstrate_string_testing_methods(test_string)