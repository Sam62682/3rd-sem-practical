print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

list1 = [1, 2, 3, 4, 5, 6]
list2 = [4, 5, 6, 7, 8, 9]

common_elements_set = set(list1).intersection(set(list2))

common_elements_list = [element for element in list1 if element in list2]

print("List 1:", list1)
print("List 2:", list2)
print("Common elements using set intersection:", common_elements_set)
print("Common elements using list comprehension:", common_elements_list)