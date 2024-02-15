package Strategy.Duck;

import Strategy.Flyable.FlyNoWay;
import Strategy.Quackable.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    
    public void display() {
        System.out.println("DecoyDuck!");
    }
}
