package Chapter_9.iterator_pattern.implicit_iteration.menus;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
