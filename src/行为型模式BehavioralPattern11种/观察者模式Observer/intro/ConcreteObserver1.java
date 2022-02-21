package 行为型模式BehavioralPattern11种.观察者模式Observer.intro;

/**
 * @Project design_pattern_demo
 * @Description 具体观察者1
 * @Company youku
 * @Create 2019年09月29日10:59
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }

}