package Composite;

import Composite.Shape.*;

public class CompositeTest {
    public static void main(String[] argv) {
        Shape compoundShape_1 = new CompoundShape();
        Shape compoundShape_2 = new CompoundShape();
        Shape compoundShape_3 = new CompoundShape();
        Shape triangle_1 = new Triangle(3);
        Shape triangle_2 = new Triangle(8);
        Shape square_1 = new Square(7);
        Shape circle_1 = new Circle(5);

        compoundShape_1.addShape(triangle_1);
        compoundShape_1.addShape(square_1);
        compoundShape_1.addShape(compoundShape_3);

        compoundShape_2.addShape(triangle_2);
        compoundShape_2.addShape(compoundShape_1);
        compoundShape_2.addShape(circle_1);

        System.out.println(compoundShape_1.getInfo(0));
        System.out.println(compoundShape_2.getInfo(0));
        System.out.println(triangle_1.getInfo(0));
        System.out.println(square_1.getInfo(0));
    }
}
