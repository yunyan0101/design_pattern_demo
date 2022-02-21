package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:14
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class ExportCost implements Cost {
    @Override
    public void revalueReact() {
        System.out.println("出口收入降低，利润率降低");

    }

    @Override
    public void devalueReact() {
        System.out.println("出口收入升高，利润率升高");

    }
}
