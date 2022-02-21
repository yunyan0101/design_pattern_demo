package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.abstractfactory.example;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日3:49 PM
 * @Author xuejian.yxj
 */
public class SRfarm implements Farm {
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}