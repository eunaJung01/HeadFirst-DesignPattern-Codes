package Chapter_1.Ducks;

import Chapter_1.Fly.FlyNoWay;
import Chapter_1.Quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }

}
