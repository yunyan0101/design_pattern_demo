package 行为型模式BehavioralPattern11种.观察者模式Observer.example.weatherdata;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2020年07月27日10:20 AM
 * @Author kidding
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        if (observerList == null) {
            observerList = new ArrayList<>();
        }
        if (observerList.contains(o)) {
            return;
        }
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observerList == null) {
            return;
        }
        if (!observerList.contains(o)) {
            return;
        }
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        if (observerList == null || observerList.size() <= 0) {
            return;
        }
        for (Observer observer : observerList) {
            observer.update(this.getTemp(), this.getHumidity(), this.getPressure());
        }
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
