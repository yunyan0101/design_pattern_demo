package 创建型模式CreatingPattern5种.工厂方法模式FactoryMethod.abstractfactory.example;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日3:48 PM
 * @Author xuejian.yxj
 */
public class SGfarm implements Farm {
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}