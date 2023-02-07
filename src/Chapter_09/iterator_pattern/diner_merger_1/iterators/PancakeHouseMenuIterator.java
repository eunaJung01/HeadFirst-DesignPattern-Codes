package Chapter_09.iterator_pattern.diner_merger_1.iterators;

import Chapter_09.iterator_pattern.diner_merger_1.menus.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.size() > position;
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }

}
