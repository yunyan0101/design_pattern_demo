package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.factorymethod.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日12:02 PM
 * @Author xuejian.yxj
 */
public class ConcreteFactory1 implements AbstractFactory {
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}