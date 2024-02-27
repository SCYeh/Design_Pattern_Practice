package Composite.Shape;

public class Triangle extends Shape {
    private int sideLength;

    public Triangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public int perimeter() {
        return sideLength * 3;
    }

    public String getInfo(int indent) {
        return String.format("Triangle side length: %d, perimeter: %d", sideLength, perimeter());
    }

    public void addShape(Shape shape) {}
}
