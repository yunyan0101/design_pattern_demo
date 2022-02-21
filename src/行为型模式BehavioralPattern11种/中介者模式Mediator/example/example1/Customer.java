package 行为型模式BehavioralPattern11种.中介者模式Mediator.example.example1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @Project design_pattern_demo
 * @Description 抽象客户类
 * @Company youku
 * @Create 2019年09月29日17:26
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public abstract class Customer extends JFrame implements ActionListener {

    protected Mediator mediator;

    public static Integer axisX = 0;

    public static Integer axisY = 100;
    public static Integer windowHeight = 330;
    public static Integer windowWidth = 250;
    public static Integer rows = 10;
    public static Integer columns = 18;

    JTextField SentText;
    JTextArea ReceiveArea;

    public Customer() {
    }

    public Customer(String name) {
        super(name);
    }

    void ClientWindow(int x, int y) {
        Container cp;
        JScrollPane sp;
        JPanel p1, p2;
        cp = this.getContentPane();
        SentText = new JTextField(columns);
        ReceiveArea = new JTextArea(rows, columns);
        ReceiveArea.setEditable(false);
        p1 = new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
        p1.add(ReceiveArea);
        sp = new JScrollPane(p1);
        cp.add(sp, BorderLayout.NORTH);
        p2 = new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
        p2.add(SentText);
        cp.add(p2, BorderLayout.SOUTH);
        SentText.addActionListener(this);
        this.setLocation(x, y);
        this.setSize(windowWidth, windowHeight);
        this.setResizable(false); //窗口大小不可调整
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tempInfo = SentText.getText().trim();
        SentText.setText("");
        this.send(tempInfo);
    }

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void send(String msg);

    abstract void receive(Customer customer, String msg);

}
