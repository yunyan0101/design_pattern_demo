package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.abstractfactory.example;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日3:48 PM
 * @Author xuejian.yxj
 */
public interface Farm {
    public Animal newAnimal();
    public Plant newPlant();
}
