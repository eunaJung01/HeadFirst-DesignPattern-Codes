package Chapter_3.condiments;

import Chapter_3.beverages.Beverage;

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
