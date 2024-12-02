def display_keyword_arguments(**kwargs):
    print("Keyword arguments:")
    for key, value in kwargs.items():
        print(f"{key}: {value}")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    display_keyword_arguments(name="Alice", age=30, city="New York", occupation="Engineer")