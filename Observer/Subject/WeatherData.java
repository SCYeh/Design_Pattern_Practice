package Observer.Subject;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer.Observer;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        if (observers.isEmpty()) { System.out.println("No Observers!");}
        for (Observer o : observers) {
            o.update();
        }
        System.out.println("");
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    // 手動使Subject發生狀態改變
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
