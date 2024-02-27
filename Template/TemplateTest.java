package Template;

import Template.Beverage.*;

public class TemplateTest {
    public static void main(String[] argv) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
