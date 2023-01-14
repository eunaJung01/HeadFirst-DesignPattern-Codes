package Chapter_9.iterator_pattern.diner_merger_2.iterators;

import Chapter_9.iterator_pattern.diner_merger_2.menus.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list.length > position;
    }

    @Override
    public MenuItem next() {
        return list[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (list[position - 1] != null) {
            if (list.length - 1 - (position - 1) >= 0)
                System.arraycopy(list, position - 1 + 1, list, position - 1, list.length - 1 - (position - 1));
            list[list.length - 1] = null;
        }
    }

}
