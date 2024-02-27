package Iterator.Iterator;

import Iterator.Menu.MenuItem;

public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int itemsIdx = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next() {
        return menuItems[itemsIdx++];
    }

    public boolean hasNext() {
        return itemsIdx < menuItems.length && menuItems[itemsIdx] != null;
    }
}
