package 行为型模式BehavioralPattern11种.中介者模式Mediator.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日17:49
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Test {

    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("张三");
        Buyer buyer2 = new Buyer("李四");
        Buyer buyer3 = new Buyer("王五");
        EstateMediator estateMediator = new EstateMediator();
        estateMediator.register(buyer1);
        estateMediator.register(buyer2);
        estateMediator.register(buyer3);
    }
}
