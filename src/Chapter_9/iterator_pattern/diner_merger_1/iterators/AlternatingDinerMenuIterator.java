package Chapter_9.iterator_pattern.diner_merger_1.iterators;

import Chapter_9.iterator_pattern.diner_merger_1.menus.MenuItem;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {

    MenuItem[] list;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
        this.list = list;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 2;
        return menuItem;
    }

    @Override
    public String toString() {
        return "Alternating Diner Menu Iterator";
    }

}
