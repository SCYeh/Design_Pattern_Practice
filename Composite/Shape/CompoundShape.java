package Composite.Shape;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape extends Shape {
    private List<Shape> shapes;

    public CompoundShape() {
        this.shapes = new ArrayList<>();
    }

    public int perimeter() {
        int res = 0;
        for (Shape shape : shapes) {
            res += shape.perimeter();
        }
        return res;
    }

    public String getInfo(int indent) {
        String res = String.format("CompoundShape perimeter: %d {\n", perimeter());
        for (Shape shape : shapes) {
            for (int i = 0; i < (indent+1); i++) {
                res += "    ";
            }
            res += (shape.getInfo(indent + 1) + "\n");
        }
        for (int i = 0; i < indent; i++) {
            res += "    ";
        }
        return res + "}";
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}
