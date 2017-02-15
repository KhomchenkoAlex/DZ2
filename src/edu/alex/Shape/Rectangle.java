package edu.alex.Shape;

/**
 * Created by alex on 07.11.16.
 */
public class Rectangle extends Shape {

    protected float sideA, sideB;

    public Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public void shapeInfo() {
        double hipo = Math.sqrt(sideA * sideA + sideB * sideB);
        float innerTriangleArea = (sideA * sideB) / 2;
        double innerTrianglePerimeter = sideA + sideB + hipo;
        System.out.format("Type of shape: %s" + ", area = %.3f" + ", perimeter = %.3f%n", typeOfShape, area, perimeter);
        System.out.format("Inner triangles: area - %.3f, " + "perimeter - %.3f%n", innerTriangleArea, innerTrianglePerimeter);
    }

}
