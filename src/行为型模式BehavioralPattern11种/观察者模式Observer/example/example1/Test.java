package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:12
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Test {
    public static void main(String[] args) {
        Cost importCost = new ImportCost();
        Cost exportCost = new ExportCost();
        Rate rmbRate = new RmbRate();
        rmbRate.add(importCost);
        rmbRate.add(exportCost);
        rmbRate.devalue();
        rmbRate.revalue();
    }
}
