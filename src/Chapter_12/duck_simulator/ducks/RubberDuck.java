package Chapter_12.duck_simulator.ducks;

import Chapter_12.duck_simulator.Quackable;
import Chapter_12.duck_simulator.observers.Observable;
import Chapter_12.duck_simulator.observers.Observer;

public class RubberDuck implements Quackable {

    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Rubber Duck";
    }

}
