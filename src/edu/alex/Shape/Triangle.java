package edu.alex.Shape;

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
    public double calculateArea(){
        double p = calculatePerimeter()/2;
        return 	Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public double calculatePerimeter(){
        return (sideA + sideB + sideC);
    }
}