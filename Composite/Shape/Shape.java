package Composite.Shape;

public abstract class Shape {
    public abstract int perimeter();
    public abstract String getInfo(int indent);
    public abstract void addShape(Shape shape);
}
