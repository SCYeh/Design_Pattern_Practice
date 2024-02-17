package Decorator;

import Decorator.Beverage.*;
import Decorator.CondimentDecorator.*;

public class DecoratorTest {
    public static void main(String[] argv) {
        Beverage beverage_1 = new Espresso();
        System.out.println(beverage_1.getDescription() + " $" + beverage_1.cost());

        Beverage beverage_2 = new Espresso();
        beverage_2 = new Milk(beverage_2);
        System.out.println(beverage_2.getDescription() + " $" + beverage_2.cost());

        Beverage beverage_3 = new DarkRoast();
        beverage_3 = new Milk(beverage_3);
        beverage_3 = new Mocha(beverage_3);
        System.out.println(beverage_3.getDescription() + " $" + beverage_3.cost());
    }
}
