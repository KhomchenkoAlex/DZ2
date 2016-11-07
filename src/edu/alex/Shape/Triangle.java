package edu.alex.Shape;

/**
 * Created by alex on 07.11.16.
 */

public class Triangle extends Shape{
    private float sideA, sideB, sideC;
    public Triangle(float sideA, float sideB, float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    double calculateArea(){
        double p = calculatePerimeter()/2;
        return 	Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    double calculatePerimeter(){
        return (sideA + sideB + sideC);
    }
}