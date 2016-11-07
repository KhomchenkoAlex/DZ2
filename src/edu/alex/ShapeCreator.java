package edu.alex;

/**
 * Created by alex on 07.11.16.
 */
import java.util.*;
import edu.alex.Shape.*;

public class ShapeCreator {
    static float readValue(){
        Scanner scan = new Scanner(System.in);
        float f = scan.nextFloat();
        return f;
    }

    static float inputValue(){
        float value = 0;
        boolean validInput = false;
        while (!validInput){
            try{
                value = readValue();
            } catch (InputMismatchException e){
                //System.out.println ("Value must be a digit");
            }
            if (value <= 0){
                System.out.println ("Value must be a digit and greater than zero!");
                validInput = false;
            }
            else validInput = true;
        }
        return value;
    }

    static Circle createCircle(){
        System.out.println("Input radius of circle:");
        return new Circle(inputValue());
    }

    static Square createSquare(){
        System.out.println("Input side of square:");
        return new Square(inputValue());
    }

    static Rectangle createRectangle(){
        System.out.println("Input 1st side of rectangle:");
        float a = inputValue();
        System.out.println("Input 2nd side of rectangle:");
        float b = inputValue();
        return new Rectangle(a,b);
    }

    static Triangle createTriangle(){
        boolean validTriangle = true;
        float a = 0;
        float b = 0;
        float c = 0;
        while(validTriangle){
            System.out.println("Input 1st side of triangle:");
            a = inputValue();
            System.out.println("Input 2nd side of triangle:");
            b = inputValue();
            System.out.println("Input 3rd side of triangle:");
            c = inputValue();
            if ((a+b)>c && (b+c)>a && (a+c)>b)
                validTriangle = false;
            else {
                System.out.println("This triangle does not exist!");
                validTriangle = true;
            }
        }
        return new Triangle(a,b,c);
    }
}
