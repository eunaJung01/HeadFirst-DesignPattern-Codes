package Chapter_9.composite_pattern.menu;

import Chapter_9.composite_pattern.menu.menus.MenuComponent;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

}
