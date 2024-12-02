import turtle
import random
print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")
turtle.speed(0)  
turtle.bgcolor("black")  

colors = ["red", "green", "blue", "yellow", "purple", "orange", "cyan", "magenta", "white"]

num_circles = 10
radius_increment = 20

for i in range(num_circles):
    turtle.color(random.choice(colors))
    
    turtle.penup()
    turtle.goto(0, -i * radius_increment)
    turtle.pendown()
    
    turtle.circle(i * radius_increment)  
    
turtle.hideturtle()
turtle.done()