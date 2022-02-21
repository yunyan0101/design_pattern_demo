package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example3;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:39
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Test {

    public static void main(String[] args) {
        Bear bear = new Bear();
        Bull bull = new Bull();
        OilFutures oilFutures = new OilFutures();
        oilFutures.addObserver(bear);
        oilFutures.addObserver(bull);
        oilFutures.setPrice(-10);
        oilFutures.notifyObservers(oilFutures.getPrice());
    }
}
