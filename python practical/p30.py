def demonstrate_variable_length_args(*args, **kwargs):
    
    print("Non-keyword arguments (args):")
    for arg in args:
        print(arg)
        
    print("\nKeyword arguments (kwargs):")
    for key, value in kwargs.items():
        print(f"{key}: {value}")
if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    demonstrate_variable_length_args(1, 2, 3, name="Alice", age=30, city="New York")