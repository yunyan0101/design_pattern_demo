package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example2;

import java.util.Observable;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日11:48
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Bell extends Observable {

    private RingTypeEnum ring;

    public void rings(RingTypeEnum ring) {
        System.out.println("----------------");
        switch (ring) {
            case BEGINS:
                System.out.println("上课铃响了");
                break;
            case ENDS:
                System.out.println("下课铃响了");
                break;
            default:
                System.out.println("无事发生");
                break;
        }
        this.setRing(ring);
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    public RingTypeEnum getRing() {
        return ring;
    }

    public void setRing(RingTypeEnum ring) {
        this.ring = ring;
    }
}
