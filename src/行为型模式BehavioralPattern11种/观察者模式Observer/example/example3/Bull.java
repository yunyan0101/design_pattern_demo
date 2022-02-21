package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example3;

import java.util.Observable;
import java.util.Observer;

/**
 * @Project design_pattern_demo
 * @Description 多方
 * @Company youku
 * @Create 2019年09月29日11:34
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Bull implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        OilFutures oilFutures = (OilFutures)o;
        Integer price = (Integer)arg;
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心");
        }
    }
}
