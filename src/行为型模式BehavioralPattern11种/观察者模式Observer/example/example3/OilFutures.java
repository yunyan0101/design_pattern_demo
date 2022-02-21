package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example3;

import java.util.Observable;

/**
 * @Project design_pattern_demo
 * @Description 原油期货
 * @Company youku
 * @Create 2019年09月29日11:26
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class OilFutures extends Observable {

    private Integer price;

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
