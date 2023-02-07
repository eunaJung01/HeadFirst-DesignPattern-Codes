package Chapter_09.iterator_pattern.implicit_iteration;

import Chapter_09.iterator_pattern.implicit_iteration.menus.DinerMenu;
import Chapter_09.iterator_pattern.implicit_iteration.menus.PancakeHouseMenu;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

}
