package 结构型模式StructuralPattern7种.代理模式Proxy.example;

import javax.swing.*;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日5:04 PM
 * @Author xuejian.yxj
 */
public class WySpecialty extends JFrame implements Specialty {
    private static final long serialVersionUID = 1L;

    public void display() {
        System.out.println("韶关代理婺源特产测试");
    }
}