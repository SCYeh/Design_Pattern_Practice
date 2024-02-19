package Factory;

import Factory.PizzaStore.*;

public class FactoryTest {
    public static void main(String[] argv) {
        PizzaStore NYStylePizzaStore = new NYStylePizzaStore();
        NYStylePizzaStore.orderPizza("Cheese");
        NYStylePizzaStore.orderPizza("Veggie");

        PizzaStore MNStylePizzaStore = new MNStylePizzaStore();
        MNStylePizzaStore.orderPizza("Cheese");
        MNStylePizzaStore.orderPizza("Veggie");
    }
}
