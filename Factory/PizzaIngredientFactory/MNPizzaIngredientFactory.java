package Factory.PizzaIngredientFactory;

import Factory.Ingredient.*;

public class MNPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new MNDough();
    }

    public Cheese createCheese() {
        return new MNCheese();
    }

    public Veggie createVeggie() {
        return new MNVeggie();
    }
}
