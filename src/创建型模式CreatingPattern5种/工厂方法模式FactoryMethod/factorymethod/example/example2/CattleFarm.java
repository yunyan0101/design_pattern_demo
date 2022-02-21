package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.factorymethod.example.example2;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日2:59 PM
 * @Author xuejian.yxj
 */
public class CattleFarm implements AnimalFarm {
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}
