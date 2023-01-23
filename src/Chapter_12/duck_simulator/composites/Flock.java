package Chapter_12.duck_simulator.composites;

import Chapter_12.duck_simulator.Quackable;
import Chapter_12.duck_simulator.observers.Observer;

import java.util.ArrayList;
import java.util.List;

// 컴포지트 패턴을 위한 복합 객체
public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }

}
