package Chapter_2;

import Chapter_2.Observers.CurrentConditionsDisplay;
import Chapter_2.Observers.ForecastDisplay;
import Chapter_2.Observers.StatisticsDisplay;
import Chapter_2.Subjects.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // 새로운 기상 측정값이 들어오는 상황을 가정
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(79, 90, 29.2f);
    }

}
