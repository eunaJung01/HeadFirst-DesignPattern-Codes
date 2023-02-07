package Chapter_09.iterator_pattern.implicit_iteration.menus;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
