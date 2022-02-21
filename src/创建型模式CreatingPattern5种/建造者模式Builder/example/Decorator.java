package 创建型模式CreatingPattern5种.建造者模式Builder.example;

/**
 * @Project design_pattern_demo
 * @Description 抽象建造者：装修工人
 * @Create 2021年02月20日4:18 PM
 * @Author xuejian.yxj
 */
public abstract class Decorator {

    //创建产品对象
    protected Parlour product = new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}
