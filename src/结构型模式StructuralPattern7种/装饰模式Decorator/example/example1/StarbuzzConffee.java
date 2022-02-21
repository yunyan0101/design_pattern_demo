package 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1;

import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.beverage.DarkRoast;
import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.beverage.Espresso;
import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.beverage.HouserBlend;
import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.condiment.Mocha;
import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.condiment.Soy;
import 结构型模式StructuralPattern7种.装饰模式Decorator.example.example1.condiment.Whip;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2020年01月21日17:42
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2020 youku, All Rights Reserved.
 */
public class StarbuzzConffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $"  + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $"  + beverage1.cost());

        Beverage beverage2 = new HouserBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $"  + beverage2.cost());


    }
}
