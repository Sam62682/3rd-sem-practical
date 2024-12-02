print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

main_string = input("Enter the main string: ")
substring = input("Enter the substring to count: ")
count = 0
for i in range(len(main_string) - len(substring) + 1):
    if main_string[i:i + len(substring)] == substring:
        count += 1
print(f"The substring '{substring}' appears {count} times in '{main_string}'.")
