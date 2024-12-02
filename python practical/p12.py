def sum_of_digits(number):
    digits = str(number)
    digit_sum = 0

    for digit in digits:
        digit_value = int(digit)
        digit_sum += digit_value

    return digit_sum

def product_of_digits(number):
    digits = str(number)
    digit_product = 1

    for digit in digits:
        digit_value = int(digit)
        digit_product *= digit_value

    return digit_product
    

try:
    print("Name : Sameer\nClass : M.Sc(IT) 3rd Sem\n")
    user_input = int(input("Enter a number: "))
    total_sum = sum_of_digits(user_input)
    total_product = product_of_digits(user_input)
    print(f"Sum of digits: {total_sum}")
    print(f"Product of digits: {total_product}")
except ValueError:
    print("Please enter a valid integer.")
