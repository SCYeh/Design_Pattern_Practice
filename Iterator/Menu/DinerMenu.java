package Iterator.Menu;

import Iterator.Iterator.*;

public class DinerMenu implements Menu {
    static final int MAX_ITEM = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEM];

        addItem("HotDog", 15);
        addItem("Steak", 120);
        addItem("Soup", 45);
    }

    public void addItem(String name, int price) {
        MenuItem menuItem = new MenuItem(name, price);
        
        if (numberOfItems >= MAX_ITEM) {
            System.out.println("Menu is full!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
