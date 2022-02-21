package 行为型模式BehavioralPattern11种.策略模式Strategy.example.duck;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2020年07月21日3:13 PM
 * @Author kidding
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public class DuckSimulator {

    public static void main(String[] args) {
       Duck  mallardDuck = new MallardDuck();
       mallardDuck.performFly();
       mallardDuck.performQuack();
    }

}
