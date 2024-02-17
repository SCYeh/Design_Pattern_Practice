package Decorator.Beverage;

public class DarkRoast implements Beverage {
    public String getDescription() {
        return "DarkRoast";
    }
    public int cost() {
        return 70;
    }
}
