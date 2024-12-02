import math

def calculate_square_root():
    try:
        number = float(input("Enter a number to find its square root: "))
        
        if number < 0:
            raise ValueError("Cannot calculate the square root of a negative number.")
        
        square_root = math.sqrt(number)

    except ValueError as ve:
        print(f"Error: {ve}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    else:
        print(f"The square root of {number} is: {square_root}")
    finally:
        print("Execution of the square root calculation is complete.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    calculate_square_root()