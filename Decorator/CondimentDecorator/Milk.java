package Decorator.CondimentDecorator;

import Decorator.Beverage.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    public int cost() {
        return beverage.cost() + 15;
    }
}
