package Template.Beverage;

public abstract class CaffeineBeverage {
    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();
    public abstract void addCondiments();

    final public void boilWater() {
        System.out.println("Boiling water!");
    }

    final public void pourInCup() {
        System.out.println("Pouring into cup!");
    }
}
