package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:05
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public abstract class Rate {

    protected List<Cost> list = new ArrayList<>();

    /**
     * 新增
     *
     * @param cost
     */
    public void add(Cost cost) {
        list.add(cost);
    }

    /**
     * 删除
     *
     * @param cost
     */
    public void remove(Cost cost) {
        list.remove(cost);
    }

    /**
     * 升值
     */
    abstract void revalue();

    /**
     * 贬值
     */
    abstract void devalue();

}
