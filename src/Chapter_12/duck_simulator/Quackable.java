package Chapter_12.duck_simulator;

import Chapter_12.duck_simulator.observers.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
