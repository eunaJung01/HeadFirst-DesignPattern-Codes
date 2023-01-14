package Chapter_9.iterator_pattern.diner_merger_1;

import Chapter_9.iterator_pattern.diner_merger_1.menus.DinerMenu;
import Chapter_9.iterator_pattern.diner_merger_1.menus.PancakeHouseMenu;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

}
