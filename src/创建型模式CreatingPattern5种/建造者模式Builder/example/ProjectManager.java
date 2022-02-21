package 创建型模式CreatingPattern5种.建造者模式Builder.example;

/**
 * @Project design_pattern_demo
 * @Description 指挥者：项目经理
 * @Create 2021年02月20日4:19 PM
 * @Author xuejian.yxj
 */
public class ProjectManager {
    private Decorator builder;
    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}
