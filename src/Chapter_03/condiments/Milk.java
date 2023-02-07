package Chapter_03.condiments;

import Chapter_03.beverages.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        System.out.println("[ Milk ] beverage size: " + beverage.getSize());
        return .10 + beverage.cost();
    }

}
