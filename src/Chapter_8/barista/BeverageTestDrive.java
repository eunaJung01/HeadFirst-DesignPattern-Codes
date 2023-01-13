package Chapter_8.barista;

import Chapter_8.barista.beverages.Coffee;
import Chapter_8.barista.beverages.Tea;
import Chapter_8.barista.hooks.CoffeeWithHook;
import Chapter_8.barista.hooks.TeaWithHook;

public class BeverageTestDrive {

    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        // Hook
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }

}
