package 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.condiment;

import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.Beverage;
import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.CondimentDecorator;

/**
 * @Project design_pattern_demo
 * @Description 豆浆
 * @Company youku
 * @Create 2020年01月21日17:41
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}