package Chapter_12.duck_simulator.observers;

public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }

    @Override
    public String toString() {
        return "Quackologist";
    }

}
