package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:06
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public interface Cost {

    /**
     * 成本对升值做出反应
     */
    void revalueReact();

    /**
     * 成本对贬值做出反应
     */
    void devalueReact();
}
