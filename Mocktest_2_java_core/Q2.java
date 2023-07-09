// Superclass Shape
abstract class Shape {
    public abstract double calculateArea();
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// ShapeCalculator class
class ShapeCalculator {
    public void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(5, 7);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 6);

        calculator.printArea(rectangle); // Output: Area: 35.0
        calculator.printArea(circle);    // Output: Area: 28.274333882308138
        calculator.printArea(triangle);  // Output: Area: 12.0
    }
}
