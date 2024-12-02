from functools import reduce

print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

numbers = [1, 2, 3, 4, 5]

sum_of_numbers = reduce(lambda x, y: x + y, numbers)

product_of_numbers = reduce(lambda x, y: x * y, numbers)

print("Original numbers:", numbers)
print("Sum of numbers:", sum_of_numbers)          
print("Product of numbers:", product_of_numbers) 