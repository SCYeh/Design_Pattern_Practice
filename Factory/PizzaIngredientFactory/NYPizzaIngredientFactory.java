package Factory.PizzaIngredientFactory;

import Factory.Ingredient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new NYDough();
    }

    public Cheese createCheese() {
        return new NYCheese();
    }

    public Veggie createVeggie() {
        return new NYVeggie();
    }
}
