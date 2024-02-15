package Strategy.Duck;

import Strategy.Flyable.FlyNoWay;
import Strategy.Quackable.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("RubberDuck!");
    }
}
