print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

tuple1 = (1, 2, 3, 4, 5)
tuple2 = ('apple', 'banana', 'cherry')
tuple3 = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

print("Tuple 1:", tuple1)
print("Tuple 2:", tuple2)

print("\nAccessing elements:")
print("First element of tuple1:", tuple1[0])
print("Last element of tuple2:", tuple2[-1])

print("\nSlicing tuples:")
print("Slice of tuple1 (from index 1 to 3):", tuple1[1:4])
print("Slice of tuple3 (first 5 elements):", tuple3[:5])

print("\nConcatenating tuples:")
tuple4 = tuple1 + tuple2
print("Concatenated tuple (tuple1 + tuple2):", tuple4)

print("\nRepeating tuples:")
tuple5 = tuple2 * 2
print("Repeated tuple2 (2 times):", tuple5)

print("\nMembership check:")
print("'apple' in tuple2:", 'apple' in tuple2)
print("'grape' in tuple2:", 'grape' in tuple2)

print("\nLength of tuples:")
print("Length of tuple1:", len(tuple1))
print("Length of tuple2:", len(tuple2))

print("\nCounting occurrences:")
print("Count of 2 in tuple1:", tuple1.count(2))
print("Count of 'banana' in tuple2:", tuple2.count('banana'))

print("\nFinding index of an element:")
print("Index of 3 in tuple1:", tuple1.index(3))
print("Index of 'cherry' in tuple2:", tuple2.index('cherry'))

print("\nConverting tuple to list:")
list_from_tuple1 = list(tuple1)
print("List from tuple1:", list_from_tuple1)

print("\nConverting list to tuple:")
list_example = [10, 20, 30]
tuple_from_list = tuple(list_example)
print("Tuple from list_example:", tuple_from_list)

print("\nNested tuples:")
nested_tuple = (tuple1, tuple2)
print("Nested tuple:", nested_tuple)

print("\nIterating through tuple1:")
for item in tuple1:
    print(item, end=' ')