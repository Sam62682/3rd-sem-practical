def divide_numbers():
    try:
        num1 = float(input("Enter the first number (numerator): "))
        num2 = float(input("Enter the second number (denominator): "))

        result = num1 / num2
    except ZeroDivisionError:
        print("Error: Cannot divide by zero. Please enter a non-zero denominator.")
    except ValueError:
        print("Error: Invalid input. Please enter numeric values.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    else:
        print(f"The result of {num1} divided by {num2} is: {result}")
    finally:
        print("Execution of the division operation is complete.")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    divide_numbers()