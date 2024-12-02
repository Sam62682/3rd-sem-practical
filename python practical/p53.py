class Person:
    def __init__(self, aadhar, name, dob):
    
        self.aadhar = aadhar
        self.name = name
        self.dob = dob

    def display_details(self):
    
        print(f"Aadhar Number: {self.aadhar}")
        print(f"Name: {self.name}")
        print(f"Date of Birth: {self.dob}")

class Student(Person):
    def __init__(self, aadhar, name, dob, roll_no, class_name):
    
        super().__init__(aadhar, name, dob) 
        self.roll_no = roll_no
        self.class_name = class_name

    def display_details(self):
    
        super().display_details() 
        print(f"Roll Number: {self.roll_no}")
        print(f"Class: {self.class_name}")

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

    aadhar_number = input("Enter Aadhar Number: ")
    name = input("Enter Name: ")
    dob = input("Enter Date of Birth (YYYY-MM-DD): ")
    roll_no = input("Enter Roll Number: ")
    class_name = input("Enter Class Name: ")

    student = Student(aadhar=aadhar_number, name=name, dob=dob, roll_no=roll_no, class_name=class_name)
    

    print("\nStudent Details:")
    student.display_details()