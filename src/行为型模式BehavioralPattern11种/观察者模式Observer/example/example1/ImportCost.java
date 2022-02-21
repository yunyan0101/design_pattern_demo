package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:13
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class ImportCost implements Cost {

    @Override
    public void revalueReact() {
        System.out.println("进口成本升高，利润率降低");
    }

    @Override
    public void devalueReact() {
        System.out.println("进口成本降低，利润率升高");

    }
}
