package Strategy.Duck;

import Strategy.Flyable.FlyWithWings;
import Strategy.Quackable.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("MallardDuck!");
    }
}
