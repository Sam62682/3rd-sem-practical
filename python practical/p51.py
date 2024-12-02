class Person:
    def __init__(self, aadhar, name, dob):
        self.aadhar = aadhar
        self.name = name
        self.dob = dob

    def display_details(self):
        print(f"Aadhar Number: {self.aadhar}")
        print(f"Name: {self.name}")
        print(f"Date of Birth: {self.dob}")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
    aadhar_number = input("Enter Aadhar Number: ")
    name = input("Enter Name: ")
    dob = input("Enter Date of Birth (YYYY-MM-DD): ")

    person = Person(aadhar=aadhar_number, name=name, dob=dob)

    print("\nPerson Details:")
    person.display_details()