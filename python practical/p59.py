import turtle
print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
turtle.speed(0) 
turtle.penup()  
turtle.goto(-200, 200) 
turtle.pendown() 

for i in range(1, 11): 
    for j in range(1, 11): 
        result = i * j
    
        turtle.write(f"{result}", align="center", font=("Arial", 12, "normal"))
        
        turtle.penup()
        turtle.forward(50) 
        turtle.pendown()
    
    turtle.penup()
    turtle.goto(-200, turtle.ycor() - 30) 
    turtle.pendown()

turtle.hideturtle() 
turtle.done()