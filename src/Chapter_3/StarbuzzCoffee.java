package Chapter_3;

import Chapter_3.Beverages.Beverage;
import Chapter_3.Beverages.DarkRoast;
import Chapter_3.Beverages.Espresso;
import Chapter_3.Beverages.HouseBlend;
import Chapter_3.Condiments.Mocha;
import Chapter_3.Condiments.Soy;
import Chapter_3.Condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("\n음료 사이즈를 먼저 설정한 경우");
        System.out.println(beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost()));

        Beverage beverage4 = new HouseBlend();
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4.setSize(Beverage.Size.VENTI);
        System.out.println("\n음료 사이즈를 나중에 설정한 경우");
        System.out.println(beverage4.getDescription() + " $" + String.format("%.2f", beverage4.cost()));
    }

}
