package 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1;

/**
 * @Project design_pattern_demo
 * @Description 饮料
 * @Company youku
 * @Create 2020年01月21日17:30
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
