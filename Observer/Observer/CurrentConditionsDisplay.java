package Observer.Observer;

import Observer.Display.Display;
import Observer.Subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // Subject通知Observer update，再由Observer自行透過getter拉取所需資料
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("Temperature: " + temp + ", Humidity: " + humidity);
    }
}
