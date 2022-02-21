package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.abstractfactory.example;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日3:53 PM
 * @Author xuejian.yxj
 */
public class FarmTest {

    public static void main(String[] args) {
        try {
            Farm f;
            Animal a;
            Plant p;
            f = (Farm) ReadXML.getObject();
            a = f.newAnimal();
            p = f.newPlant();
            a.show();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
