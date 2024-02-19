package Factory.PizzaStore;

import Factory.Pizza.*;
import Factory.PizzaIngredientFactory.*;

public class MNStylePizzaStore extends PizzaStore {
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new MNPizzaIngredientFactory();

        switch (pizzaType) {
            case "Cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("MN Style Cheese Pizza");
                break;
            case "Veggie":
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("MN Style Veggie Pizza");
                break;
            default:
                break;
        }
        return pizza;
    }
}
