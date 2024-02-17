package Decorator.CondimentDecorator;

import Decorator.Beverage.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    public int cost() {
        return beverage.cost() + 25;
    }
}
