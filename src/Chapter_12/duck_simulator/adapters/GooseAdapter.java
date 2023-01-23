package Chapter_12.duck_simulator.adapters;

import Chapter_12.duck_simulator.Quackable;
import Chapter_12.duck_simulator.observers.Observable;
import Chapter_12.duck_simulator.observers.Observer;

// 어댑터 패턴
public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "Goose pretending to be a Duck";
    }

}
