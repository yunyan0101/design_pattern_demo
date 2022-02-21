package 行为型模式BehavioralPattern11种.策略模式Strategy.example.duck;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2020年07月21日2:57 PM
 * @Author kidding
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
