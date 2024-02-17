package Decorator.Beverage;

public class Espresso implements Beverage {
    public String getDescription() {
        return "Espresso";
    }
    public int cost() {
        return 85;
    }
}
