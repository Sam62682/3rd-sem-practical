global_var = "I am a global variable"

def demonstrate_variables():
    global global_var
    
    local_var = "I am a local variable"
    
    print(local_var)  
    print(global_var)  
    
    global_var = "I have been modified globally"

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    print("Before function call:")
    print(global_var) 

    demonstrate_variables()

    print("\nAfter function call:")
    print(global_var) 