package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.abstractfactory.example;

import java.awt.*;

import javax.swing.*;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日3:48 PM
 * @Author xuejian.yxj
 */
public class Fruitage implements Plant {
    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");
    public Fruitage() {
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("植物：水果"));
        sp = new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon("src/创建型模式CreatingPattern5种.工厂方法模式FactoryMethod/P_Fruitage.jpg"));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户点击窗口关闭
    }
    public void show() {
        jf.setVisible(true);
    }
}