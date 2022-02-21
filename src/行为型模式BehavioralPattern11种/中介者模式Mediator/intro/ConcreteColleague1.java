package 行为型模式BehavioralPattern11种.中介者模式Mediator.intro;

/**
 * @Project design_pattern_demo
 * @Description 具体同事1
 * @Company youku
 * @Create 2019年09月29日16:53
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }
}