def calculator():
    try:
        num1 = float(input("Enter the first number: "))
        num2 = float(input("Enter the second number: "))

        addition = num1 + num2
        subtraction = num1 - num2
        multiplication = num1 * num2
        
        if num2 == 0:
            raise ZeroDivisionError("You cannot divide by zero.")
        division = num1 / num2

    except ZeroDivisionError as zde:
        print(f"Error: {zde}")
    except ValueError:
        print("Error: Invalid input. Please enter numeric values.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    else:
        print(f"Results:")
        print(f"Addition: {num1} + {num2} = {addition}")
        print(f"Subtraction: {num1} - {num2} = {subtraction}")
        print(f"Multiplication: {num1} * {num2} = {multiplication}")
        print(f"Division: {num1} / {num2} = {division}")
    finally:
        print("Execution of the calculator operation is complete.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    calculator()