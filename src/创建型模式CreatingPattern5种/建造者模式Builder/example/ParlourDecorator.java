package 创建型模式CreatingPattern5种.建造者模式Builder.example;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日4:20 PM
 * @Author xuejian.yxj
 */
public class ParlourDecorator {
    public static void main(String[] args) {
        try {
            Decorator d;
            d = (Decorator) ReadXML.getObject();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
