package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.factorymethod.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日12:03 PM
 * @Author xuejian.yxj
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
