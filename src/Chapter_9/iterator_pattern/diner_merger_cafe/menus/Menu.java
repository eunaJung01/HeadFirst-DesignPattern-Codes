package Chapter_9.iterator_pattern.diner_merger_cafe.menus;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
