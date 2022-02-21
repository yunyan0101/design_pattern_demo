package 行为型模式BehavioralPattern11种.策略模式Strategy.example.duck;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2020年07月21日3:00 PM
 * @Author kidding
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a MallardDuck");
    }

}
