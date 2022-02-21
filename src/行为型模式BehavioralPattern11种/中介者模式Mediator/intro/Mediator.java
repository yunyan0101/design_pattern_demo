package 行为型模式BehavioralPattern11种.中介者模式Mediator.intro;

/**
 * @Project design_pattern_demo
 * @Description 抽象中介者
 * @Company youku
 * @Create 2019年09月29日16:50
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public abstract class Mediator {


    public abstract void register(Colleague colleague);

    /**
     * 转发
     *
     * @param colleague
     */
    public abstract void relay(Colleague colleague);

}
