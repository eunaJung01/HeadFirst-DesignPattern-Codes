package Chapter_01;

import Chapter_01.ducks.Duck;
import Chapter_01.ducks.MallardDuck;
import Chapter_01.ducks.ModelDuck;
import Chapter_01.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n---\n");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
