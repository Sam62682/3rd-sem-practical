print("Name : Sameer\nClass : M.Sc(IT) 3rd sem\n")
marks = []
for i in range(1, 6):
    mark = int(input("Enter the subject marks (0-100): "))
    if 0 <= mark <= 100:  
        marks.append(mark)
    else:
        print("Please enter valid marks between 0 and 100.")

total_marks = sum(marks)
print("Total marks is : ", total_marks)
average_marks = total_marks/5
print("Average marks is : ", average_marks)
percentage = (total_marks/500) * 100
print("Percentage is : ", percentage)

if percentage >= 80:
    print("Grange A")
elif percentage >= 70:
    print("Grade B")
elif percentage >= 60:
    print("Grade C")
elif percentage >= 33:
    print("Grade D")
else:
    print("Fail")