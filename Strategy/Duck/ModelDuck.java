package Strategy.Duck;

import Strategy.Flyable.FlyNoWay;
import Strategy.Quackable.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("ModelDuck!");
    }
}
