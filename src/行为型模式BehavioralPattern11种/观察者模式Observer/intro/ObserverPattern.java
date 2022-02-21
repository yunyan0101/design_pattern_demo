package 行为型模式BehavioralPattern11种.观察者模式Observer.intro;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:01
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
    }
}
