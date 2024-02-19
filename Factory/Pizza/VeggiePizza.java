package Factory.Pizza;

import Factory.PizzaIngredientFactory.*;

public class VeggiePizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;
    
    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        veggie = pizzaIngredientFactory.createVeggie();
        System.out.println(name + " prepared!");
        System.out.println("Veggie: " + veggie.info());
    }
}
