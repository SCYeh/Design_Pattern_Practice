package Factory.PizzaStore;

import Factory.Pizza.*;
import Factory.PizzaIngredientFactory.*;

public class NYStylePizzaStore extends PizzaStore {
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        // Abstract Factory: 用於建立一系列的物件(食材)
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch (pizzaType) {
            case "Cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("NY Style Cheese Pizza");
                break;
            case "Veggie":
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("NY Style Veggie Pizza");
                break;
            default:
                break;
        }
        return pizza;
    }
}
