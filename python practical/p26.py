def sum_and_product(a, b):
    total_sum = a + b
    total_product = a * b
    return total_sum, total_product

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    
    num1 = 5
    num2 = 10
    result_sum, result_product = sum_and_product(num1, num2)
    print(f"The sum of {num1} and {num2} is: {result_sum}")
    print(f"The product of {num1} and {num2} is: {result_product}")