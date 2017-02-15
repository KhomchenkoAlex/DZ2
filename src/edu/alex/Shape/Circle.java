package edu.alex.Shape;

/**
 * Created by alex on 07.11.16.
 */
public class Circle extends Shape {
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(float radius) {
        this.radius = radius;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }
}
