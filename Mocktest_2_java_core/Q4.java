// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing Drawable interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class implementing Drawable interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
public class Q4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();      
        rectangle.draw();   
    }
}
