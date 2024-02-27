package Iterator.Menu;

import java.util.ArrayList;
import java.util.List;
import Iterator.Iterator.*;

public class DessertMenu implements Menu {
    private List<MenuItem> menuItems;

    public DessertMenu() {
        menuItems = new ArrayList<>();

        addItem("Pancake", 95);
        addItem("Brownie", 70);
    }

    public void addItem(String name, int price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new DessertMenuIterator(menuItems);
    }
}
