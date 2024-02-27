package Iterator;

import Iterator.Iterator.Iterator;
import Iterator.Menu.*;

public class IteratorTest {
    public static void main(String[] argv) {
        
        Menu dinerMenu = new DinerMenu();
        Iterator dinerMenuIterator_1 = dinerMenu.createIterator();
        traverseIterator(dinerMenuIterator_1);

        dinerMenu.addItem("French Fries", 55);
        Iterator dinerMenuIterator_2 = dinerMenu.createIterator();
        traverseIterator(dinerMenuIterator_2);

        Menu dessertMenu = new DessertMenu();
        Iterator dessertMenuIterator = dessertMenu.createIterator();
        traverseIterator(dessertMenuIterator);
    }

    public static void traverseIterator(Iterator iterator) {
        MenuItem menuItem;

        while (iterator.hasNext()) {
            menuItem = iterator.next();
            System.out.println(String.format("Menu Item name: %s, price: %d", menuItem.getName(), menuItem.getPrice()));
        }
    }
}
