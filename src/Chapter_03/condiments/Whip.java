package Chapter_03.condiments;

import Chapter_03.beverages.Beverage;

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
