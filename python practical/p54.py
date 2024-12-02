# class Teacher:
#     def __init__(self, name, employee_id):
        
#         self.name = name
#         self.employee_id = employee_id

#     def display_teacher_info(self):
        
#         print(f"Teacher Name: {self.name}")
#         print(f"Employee ID: {self.employee_id}")

# class Subject:
#     def __init__(self, subject_name, subject_code):
        
#         self.subject_name = subject_name
#         self.subject_code = subject_code

#     def display_subject_info(self):
        
#         print(f"Subject Name: {self.subject_name}")
#         print(f"Subject Code: {self.subject_code}")

# class pythonTeacher(Teacher, Subject):
#     def __init__(self, name, employee_id, subject_name, subject_code):
        
#         Teacher.__init__(self, name, employee_id)  
#         Subject.__init__(self, subject_name, subject_code)  

#     def display_info(self):

#         self.display_teacher_info()  
#         self.display_subject_info()  

# if __name__ == "__main__":
#     print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

#     name = input("Enter Teacher's Name: ")
#     employee_id = input("Enter Employee ID: ")
#     subject_name = "Python"
#     subject_code = "PYTHON101"

#     python_teacher = pythonTeacher(name, employee_id, subject_name, subject_code)

    
#     print("\npython Teacher Details:")
#     python_teacher.display_info()



def fun1():
    print("Hello World")

def fun2(self):
    print("Hello Sameer")

fun1()