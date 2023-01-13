package Chapter_2.observers;

import Chapter_2.subjects.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;

    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver((Observer) this);
    }

    // TODO: Push 방식 : 주제가 옵저버로 데이터를 보냄
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        tempSum += temp;
//        numReadings++;
//        if (temp > maxTemp) maxTemp = temp;
//        if (temp < minTemp) minTemp = temp;
//        display();
//    }

    // TODO: Pull 방식 : 옵저버가 주제로부터 데이터를 당겨옴
    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        float humidity = weatherData.getHumidity();
        float pressure = weatherData.getPressure();

        tempSum += temperature;
        numReadings++;
        if (temperature > maxTemp) maxTemp = temperature;
        if (temperature < minTemp) minTemp = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

}
