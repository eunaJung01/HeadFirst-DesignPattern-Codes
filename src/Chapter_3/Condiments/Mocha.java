package Chapter_3.Condiments;

import Chapter_3.Beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        // 먼저 장식하고 있는 객체에 작업을 위임한 다음, 그 결과에 더함
        return beverage.cost() + .20;
    }

}
