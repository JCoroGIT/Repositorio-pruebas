from turtle import *
from math import *

speed(9000000000)
bgcolor('black')
goto(0,-40)


for i in range(16):
    for j in range(18):
        color("#FFA216")
        rt(90)
        circle(150-j*6,90)
        lt(90)
        circle(150-j*6,90)
        rt(180)
    circle(40,24)

color("black")
shape("circle")
shapesize(0.5)
fillcolor("#8B4513")
golden_angle= 137.508



phi = golden_angle*(pi/180)



for i in range(110):
    r = 4*sqrt(i)
    theta = i*phi
    x= r*cos(theta)
    y= r*sin(theta)
    penup()
    goto(x,y)
    setheading(i*golden_angle)
    pendown()
    stamp()



def heart1(a):
    return 12*sin(a)**3
def heart2(b):
    return 10*cos(b)-5*\
    cos(2*b)-2*\
    cos(3*b)-\
    cos(4*b)
for i in range(6000):
    goto(heart1(i)*20 ,heart2(i)*20)
    for i in range(5):
        color("red")
    goto(0,0)

done()
