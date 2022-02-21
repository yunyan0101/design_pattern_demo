package 行为型模式BehavioralPattern11种.观察者模式Observer.example.weatherdata;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2020年07月27日10:14 AM
 * @Author kidding
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
