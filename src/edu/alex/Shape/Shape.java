package edu.alex.Shape;

/**
 * Created by alex on 07.11.16.
 */
abstract public class Shape {
    String typeOfShape = this.getClass().getName();
    double area;
    double perimeter;

    abstract double calculateArea();

    abstract double calculatePerimeter();

    public void shapeInfo() {
        System.out.format("Type of shape: %s" + ", area = %.3f" + ", perimeter = %.3f%n", typeOfShape, area, perimeter);
    }

    @Override
    public String toString() {
        return typeOfShape;
    }
}
