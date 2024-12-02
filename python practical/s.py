import turtle

# Set up the screen
screen = turtle.Screen()
screen.bgcolor("white")

# Create a turtle object
pen = turtle.Turtle()
pen.speed(3)

# Function to draw the letter 'S'
def draw_s():
    pen.penup()
    pen.goto(-50, 0)  # Start position
    pen.pendown()

    pen.setheading(180)  # Face upward (start drawing vertically)

    # Draw the top curve
    pen.circle(50, 180)  # Draw a semi-circle upwards

    # Move to the bottom part of the "S"
    pen.setheading(-180)  # Turn to face downwards
    pen.circle(50, -180)  # Draw a semi-circle downwards

# Call the function to draw "S"
draw_s()

# Hide the turtle cursor after drawing
pen.hideturtle()

# Keep the window open
screen.mainloop()
