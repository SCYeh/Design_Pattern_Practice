package Iterator.Iterator;

import java.util.List;
import Iterator.Menu.MenuItem;

public class DessertMenuIterator implements Iterator {
    private List<MenuItem> menuItems;
    private int itemsIdx;

    public DessertMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next() {
        return menuItems.get(itemsIdx++);
    }

    public boolean hasNext() {
        return itemsIdx < menuItems.size();
    }
}
