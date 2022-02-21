package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example2;

import java.util.Observable;
import java.util.Observer;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:53
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Student implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Bell bell = (Bell)o;
        RingTypeEnum ring = bell.getRing();
        if (ring == null) {
            return;
        }
        switch (ring) {
            case BEGINS:
                System.out.println("老师好！");
                break;
            case ENDS:
                System.out.println("老师再见！");
                break;
            default:
                System.out.println("无事发生");
                break;
        }
    }
}
