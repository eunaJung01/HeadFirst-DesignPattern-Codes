package Chapter_9.iterator_pattern.diner_merger_1.iterators;

import Chapter_9.iterator_pattern.diner_merger_1.menus.MenuItem;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

}
