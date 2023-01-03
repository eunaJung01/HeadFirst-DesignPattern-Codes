package Chapter_1;

import Chapter_1.Ducks.Duck;
import Chapter_1.Ducks.MallardDuck;
import Chapter_1.Ducks.ModelDuck;
import Chapter_1.Fly.FlyRocketPowered;

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
