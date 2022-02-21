package 行为型模式BehavioralPattern11种.中介者模式Mediator.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日17:40
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Buyer extends Customer {

    public Buyer(String name) {
        super(name);
        Customer.axisX += 300;
        ClientWindow(Customer.axisX, Customer.axisY);
    }

    @Override
    void send(String msg) {
        String content = msg + ":" + "我";
        Integer subLength = 27 - content.length();
        System.out.println(ReceiveArea.getWidth());
        System.out.println("content.length" + content.length());
        System.out.println("subLength" + subLength);
        StringBuilder sb = new StringBuilder();
        for (Integer i = 0; i < subLength; i++) {
            sb.append(" ");
        }
        System.out.println("subString.length" + sb.length());
        sb.append(content);
        sb.append("\n");
        System.out.println(sb.length());
        ReceiveArea.append(sb.toString());
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
        mediator.relay(this, msg);
    }

    @Override
    void receive(Customer customer, String msg) {
        ReceiveArea.append(customer.getTitle() + ":" + msg + "\n");
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
    }

}
