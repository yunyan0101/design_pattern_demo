package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example3;

import java.util.Observable;
import java.util.Observer;

/**
 * @Project design_pattern_demo
 * @Description 空方
 * @Company youku
 * @Create 2019年09月29日11:32
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Bear implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        OilFutures oilFutures = (OilFutures)o;

        Integer price = oilFutures.getPrice();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴");
        }
    }
}
