package Chapter_12.duck_simulator.observers;

public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();

}
