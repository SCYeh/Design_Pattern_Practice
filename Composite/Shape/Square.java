package Composite.Shape;

public class Square extends Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int perimeter() {
        return sideLength * 4;
    }

    public String getInfo(int indent) {
        return String.format("Square side length: %d, perimeter: %d", sideLength, perimeter());
    }

    public void addShape(Shape shape) {}
}
