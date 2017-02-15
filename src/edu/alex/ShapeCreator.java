package edu.alex;

/**
 * Created by alex on 07.11.16.
 */

import edu.alex.Shape.Circle;
import edu.alex.Shape.Rectangle;
import edu.alex.Shape.Square;
import edu.alex.Shape.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeCreator {

    static float readValue() {
        Scanner scan = new Scanner(System.in);
        float f = scan.nextFloat();
        return f;
    }

    static float inputValue() {
        float value = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                value = readValue();
            } catch (InputMismatchException e) {
                //System.out.println ("Value must be a digit");
            }
            if (value <= 0) {
                System.out.println("Value must be a digit and greater than zero!");
                validInput = false;
            } else validInput = true;
        }
        return value;
    }

    public Circle createCircle() {
        System.out.println("Input radius of circle:");
        return new Circle(inputValue());
    }

    public Circle createCircle(int a) {
        return new Circle(a);
    }


    public Square createSquare() {
        System.out.println("Input side of square:");
        return new Square(inputValue());
    }

    public Square createSquare(int a) {
        return new Square(a);
    }

    public Rectangle createRectangle() {
        System.out.println("Input 1st side of rectangle:");
        float a = inputValue();
        System.out.println("Input 2nd side of rectangle:");
        float b = inputValue();
        return new Rectangle(a, b);
    }

    public Rectangle createRectangle(int a, int b) {
        return new Rectangle(a, b);
    }

    public Triangle createTriangle() {
        boolean validTriangle = true;
        float a = 0;
        float b = 0;
        float c = 0;
        while (validTriangle) {
            System.out.println("Input 1st side of triangle:");
            a = inputValue();
            System.out.println("Input 2nd side of triangle:");
            b = inputValue();
            System.out.println("Input 3rd side of triangle:");
            c = inputValue();
            if ((a + b) > c && (b + c) > a && (a + c) > b)
                validTriangle = false;
            else {
                System.out.println("This triangle does not exist!");
                validTriangle = true;
            }
        }
        return new Triangle(a, b, c);
    }

    public Triangle createTriangle(int a, int b, int c) {
        return new Triangle(a, b, c);
    }
}
