print("Name : Sameer\nClass : M.Sc(IT) - 3rd sem\n")
str = input("Enter a string : ")
rev_str = str[ : : -1]
if str == rev_str:
    print(str, "is a palindrome.")
else:
    print(str, "is not a palindrome.")