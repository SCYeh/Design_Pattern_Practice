package Factory.PizzaStore;

import Factory.Pizza.Pizza;

public abstract class PizzaStore {
    public final void orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    // Factory Method: 工廠方法會被定義為abstract，由子類別決定要製造出哪種口味的pizza(cheese or veggie)
    protected abstract Pizza createPizza(String pizzaType);
}
