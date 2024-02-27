package Composite.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int perimeter() {
        return radius * 3;
    }

    public String getInfo(int indent) {
        return String.format("Circle radius: %d, perimeter: %d", radius, perimeter());
    }

    public void addShape(Shape shape) {}
}
