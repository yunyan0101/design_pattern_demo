package 行为型模式BehavioralPattern11种.中介者模式Mediator.intro;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日17:05
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Test {
    public static void main(String[] args) {
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();
        Mediator mediator = new ConcreteMediator();
        mediator.register(colleague1);
        mediator.register(colleague2);
        colleague1.send();
    }
}
