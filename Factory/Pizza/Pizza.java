package Factory.Pizza;

import Factory.Ingredient.*;

public abstract class Pizza {
    protected Dough dough;
    protected Cheese cheese;
    protected Veggie veggie;
    protected String name;
    
    public abstract void prepare();

    public void bake() {
        System.out.println("Baking!");
    }

    public void cut() {
        System.out.println("Cutting!");
    }

    public void box() {
        System.out.println("Boxing!");
    }

    public void setName(String name) {
        this.name = name;
    }
}
