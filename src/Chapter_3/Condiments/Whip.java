package Chapter_3.Condiments;

import Chapter_3.Beverages.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        System.out.println("[ Whip ] beverage size: " + beverage.getSize());
        return .10 + beverage.cost();
    }

}
