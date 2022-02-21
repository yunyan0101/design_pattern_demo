package 行为型模式BehavioralPattern11种.观察者模式Observer.intro;

/**
 * @Project design_pattern_demo
 * @Description 具体目标
 * @Company youku
 * @Create 2019年09月29日11:00
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for (Object obs : observers) {
            ((Observer)obs).response();
        }

    }
}
