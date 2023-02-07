package Chapter_09.iterator_pattern.diner_merger_1.iterators;

import Chapter_09.iterator_pattern.diner_merger_1.menus.MenuItem;

public interface Iterator {

    boolean hasNext();

    MenuItem next();

}
