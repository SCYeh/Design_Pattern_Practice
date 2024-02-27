package Iterator.Menu;

import Iterator.Iterator.Iterator;

public interface Menu {
    public void addItem(String name, int price);
    public Iterator createIterator();
}
