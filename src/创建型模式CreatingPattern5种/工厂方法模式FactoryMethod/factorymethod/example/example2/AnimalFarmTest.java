package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.factorymethod.example.example2;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日2:53 PM
 * @Author xuejian.yxj
 */
public class AnimalFarmTest {

    public static void main(String[] args) {
        try {
            Animal a;
            AnimalFarm af;
            af = (AnimalFarm) ReadXML2.getObject();
            a = af.newAnimal();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
