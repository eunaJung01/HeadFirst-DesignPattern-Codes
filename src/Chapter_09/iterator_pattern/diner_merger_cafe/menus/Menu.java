package Chapter_09.iterator_pattern.diner_merger_cafe.menus;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
