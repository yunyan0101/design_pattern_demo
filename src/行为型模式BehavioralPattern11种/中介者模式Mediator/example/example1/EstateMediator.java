package 行为型模式BehavioralPattern11种.中介者模式Mediator.example.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日17:33
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class EstateMediator extends Mediator {

    List<Customer> list = new ArrayList<>();

    @Override
    void register(Customer customer) {
        if (!list.contains(customer)) {
            list.add(customer);
            customer.setMediator(this);
        }
    }

    @Override
    void relay(Customer customer, String msg) {
        for (Customer cus : list) {
            if (!cus.equals(customer)) {
                cus.receive(customer, msg);
            }
        }
    }
}
