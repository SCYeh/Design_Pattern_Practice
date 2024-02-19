package Factory.PizzaIngredientFactory;

import Factory.Ingredient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Veggie createVeggie();
}
