package Chapter_03.condiments;

import Chapter_03.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    // extends Beverage : Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하기 때문

    Beverage beverage; // 각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }

    public void setSize(Size size) {
        beverage.setSize(size);
    }

}
