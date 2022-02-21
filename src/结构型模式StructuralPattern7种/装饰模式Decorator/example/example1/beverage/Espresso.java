package 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.beverage;

import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.Beverage;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2020年01月21日17:37
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
