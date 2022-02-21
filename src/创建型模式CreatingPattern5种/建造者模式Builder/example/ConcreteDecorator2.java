package 创建型模式CreatingPattern5种.建造者模式Builder.example;

/**
 * @Project design_pattern_demo
 * @Description 具体建造者：具体装修工人2
 * @Create 2021年02月20日4:19 PM
 * @Author xuejian.yxj
 */
public class ConcreteDecorator2 extends Decorator {
    public void buildWall() {
        product.setWall("w2");
    }
    public void buildTV() {
        product.setTV("TV2");
    }
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
