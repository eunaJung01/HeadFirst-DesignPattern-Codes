package Chapter_09.iterator_pattern.implicit_iteration;

import Chapter_09.iterator_pattern.implicit_iteration.menus.DinerMenu;
import Chapter_09.iterator_pattern.implicit_iteration.menus.Menu;
import Chapter_09.iterator_pattern.implicit_iteration.menus.MenuItem;
import Chapter_09.iterator_pattern.implicit_iteration.menus.PancakeHouseMenu;

import java.util.List;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // implicit iteration
    public void printMenu() {
        List<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        for (MenuItem m : breakfastItems) {
            printMenuItem(m);
        }
        MenuItem[] lunchItems = ((DinerMenu) dinerMenu).getMenuItems();
        for (MenuItem m : lunchItems) {
            printMenuItem(m);
        }
    }

    public void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }

}
