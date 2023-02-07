package Chapter_02.observers;

import Chapter_02.subjects.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // implements Observer : WeatherData 객체로부터 변경 사항을 받기 위함

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // 디스플레이를 옵저버로 등록
    }

    // TODO: Push 방식 : 주제가 옵저버로 데이터를 보냄
//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display(); // 디스플레이 갱신
//    }

    // TODO: Pull 방식 : 옵저버가 주제로부터 데이터를 당겨옴
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display(); // 디스플레이 갱신
    }


    @Override
    public void display() {
        System.out.println("\n현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }

}
