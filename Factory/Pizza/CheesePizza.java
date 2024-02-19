package Factory.Pizza;

import Factory.PizzaIngredientFactory.*;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;
    
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        System.out.println(name + " prepared!");
        System.out.println("Cheese: " + cheese.info() + ", Dough: " + dough.info());
    }
}
