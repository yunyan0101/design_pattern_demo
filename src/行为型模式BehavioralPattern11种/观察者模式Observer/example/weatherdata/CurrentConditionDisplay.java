package 行为型模式BehavioralPattern11种.观察者模式Observer.example.weatherdata;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2020年07月27日10:27 AM
 * @Author kidding
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
            "temp=" + temp +
            ", humidity=" + humidity +
            '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
