package 行为型模式BehavioralPattern11种.中介者模式Mediator.intro;

/**
 * @Project design_pattern_demo
 * @Description 抽象同事类
 * @Company youku
 * @Create 2019年09月29日16:51
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
