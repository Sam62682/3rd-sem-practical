print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

fruits = ['apple', 'banana', 'cherry', 'date']

fruits.append('elderberry')  
print("After append:", fruits)

fruits.insert(1, 'blueberry')  
print("After insert:", fruits)

fruits.remove('banana') 
print("After remove:", fruits)

popped_fruit = fruits.pop()  
print("Popped fruit:", popped_fruit)
print("After pop:", fruits)

first_fruit = fruits[0]  
print("First fruit:", first_fruit)

sliced_fruits = fruits[1:3]  
print("Sliced fruits (index 1 to 2):", sliced_fruits)

fruits.sort()  
print("After sorting:", fruits)

fruits.reverse()  
print("After reversing:", fruits)

fruit_lengths = [len(fruit) for fruit in fruits]  
print("Lengths of fruit names:", fruit_lengths)

is_apple_present = 'apple' in fruits  
print("Is apple present?", is_apple_present)

count_of_cherry = fruits.count('cherry')  
print("Count of cherry:", count_of_cherry)

more_fruits = ['fig', 'grape']
fruits.extend(more_fruits)  
print("After extending:", fruits)

index_of_date = fruits.index('date')  
print("Index of 'date':", index_of_date)

fruits.clear()  
print("After clearing:", fruits)