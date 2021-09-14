# Lab1:CircleArea

### Author: Mingxi Xia(A20473026)
---

Execute Lab 1  in your terminal:

1. javac CircleArea.java
2. java CircleArea
***

There's the source code:

1. Class CircleArea:

```
import java.util.Scanner;

public class CircleArea {
    // main method to run the program.
    public static void main(String[] args) {
        //use scanner method to input.
        Scanner sc = new Scanner(System.in);
        //tell the user to input value.
        System.out.println("Enter the radius of the circle1: ");
        // create a new circle1 instance.
        Circle circle1 = new Circle();
        //make it available to input the value of radius.
        circle1.radius = sc.nextInt();
        //call the toString method of Circle and print the area of the new circle.
        System.out.println(circle1.toSting());

        //same for new circle2
        System.out.println("Enter the radius of the circle2: ");
        Circle circle2 = new Circle();
        circle2.radius = sc.nextInt();
        System.out.println(circle2.toSting());

        //equals method to compare circle1 and circle2.
        String c1= circle1.toSting();
        String c2 =circle2.toSting();
        System.out.println("circle1 equals circle2 is " + c1.equals(c2));
    }
}

```

2. Class Circle:

```
//Create the Circle class to store variables.
public class Circle {
        //create class variables.
        int radius ;
        double circleArea;
        //initialize the variables of the Circle class.
        public Circle(){
            radius = 0;
            circleArea = 0;
        }
        //Getter method provides access to instance variables.
        //get the new radius value when it's called.
        public double getRadius(){
            return radius;
        }
        //Setter method allows other objects to change the values
        //set the new radius value.
        public void setRadius(int radius){
            this.radius = radius;
        }
        //write the function of area and get the new area value when it's called.
        public double getCircleArea(){
            return Math.PI * radius * radius;
        }

        //toString method returns the String representation of the Circle.
        public String toSting(){
            return "The radius of the circle is " + getRadius() + ", the area of the circle is " + getCircleArea();
        }

    }

```




