package Chapter_02.subjects;

import Chapter_02.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 기상 스테이션으로부터 갱신된 측정값을 받으면 옵저버들에게 알림
    public void measurementsChanged() {
        notifyObservers();
    }

    // Subject 인터페이스의 구현
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            // TODO: Push 방식 : 주제가 옵저버로 데이터를 보냄
            // observer.update(temperature, humidity, pressure);

            // TODO: Pull 방식 : 옵저버가 주제로부터 데이터를 당겨옴
            observer.update();
        }
    }

}
