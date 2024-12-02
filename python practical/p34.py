print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

add = lambda x, y: x + y
print("Addition using lambda function:", add(5, 3))  

numbers = [1, 2, 3, 4, 5]
squared_numbers = list(map(lambda x: x ** 2, numbers))
print("Squared numbers using map and lambda:", squared_numbers)

even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print("Even numbers using filter and lambda:", even_numbers) 

from functools import reduce
product = reduce(lambda x, y: x * y, numbers)
print("Product of numbers using reduce and lambda:", product) 

students = [("John", 25), ("Jane", 22), ("Dave", 23)]
sorted_students = sorted(students, key=lambda student: student[1])
print("Students sorted by age using lambda:", sorted_students) 