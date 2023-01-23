package Chapter_12.duck_simulator.factories;

import Chapter_12.duck_simulator.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();

}
