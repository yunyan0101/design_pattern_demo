package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:09
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class RmbRate extends Rate {

    @Override
    void revalue() {

        for (Cost cost : list) {
            cost.revalueReact();
        }

    }

    @Override
    void devalue() {
        for (Cost cost : list) {
            cost.devalueReact();
        }
    }
}
