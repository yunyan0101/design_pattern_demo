package 行为型模式BehavioralPattern11种.中介者模式Mediator.intro;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project design_pattern_demo
 * @Description 具体中介者
 * @Company youku
 * @Create 2019年09月29日16:57
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class ConcreteMediator extends Mediator {

    List<Colleague> list = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!list.contains(colleague)) {
            list.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague col : list) {
            if (!col.equals(colleague)) {
                col.receive();
            }
        }
    }
}
