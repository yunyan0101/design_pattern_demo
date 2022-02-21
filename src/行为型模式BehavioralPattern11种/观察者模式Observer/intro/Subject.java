package 行为型模式BehavioralPattern11种.观察者模式Observer.intro;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project design_pattern_demo
 * @Description 抽象目标
 * @Company youku
 * @Create 2019年09月29日10:57
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();

    /**
     * 增加观察者方法
     *
     * @param observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者方法
     *
     * @param observer
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}
