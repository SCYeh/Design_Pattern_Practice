package Observer;

import Observer.Observer.CurrentConditionsDisplay;
import Observer.Subject.WeatherData;

public class ObserverTest {
    public static void main(String[] argv) {
        WeatherData weatherData = new WeatherData();

        // 這裡勢必需要new出各個Observer物件，這樣未來才能remove
        CurrentConditionsDisplay currentConditionsDisplay_1 = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay_2 = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(27, 25, 15);
        weatherData.removeObserver(currentConditionsDisplay_1);
        weatherData.setMeasurements(22, 20, 10);
    }
}
