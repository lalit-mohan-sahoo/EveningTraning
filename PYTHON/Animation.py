import turtle
import random
import colorsys

# Set up the screen
t = turtle.Turtle()
t.speed(0)
turtle.bgcolor("black")
turtle.title("Python VFX Animation")

# Use colorsys to create rainbow colors
colors = []
for i in range(36):
    colors.append(colorsys.hsv_to_rgb(i/36, 1.0, 1.0))

# Draw glowing effect pattern
for i in range(360):
    color = colors[i % 36]
    t.color(color)
    t.pensize(2)
    t.forward(i * 0.5)
    t.right(61)
    t.forward(i * 0.3)
    t.right(59)

turtle.done()