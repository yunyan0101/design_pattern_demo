package 行为型模式BehavioralPattern11种.中介者模式Mediator.example.example1;

/**
 * @Project design_pattern_demo
 * @Description 抽象中介者
 * @Company youku
 * @Create 2019年09月29日17:27
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public abstract class Mediator {
    abstract void register(Customer customer);

    abstract void relay(Customer customer, String msg);
}
