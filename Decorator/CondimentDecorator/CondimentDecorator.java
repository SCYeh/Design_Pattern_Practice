package Decorator.CondimentDecorator;

import Decorator.Beverage.Beverage;

public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
    public abstract int cost();
}
