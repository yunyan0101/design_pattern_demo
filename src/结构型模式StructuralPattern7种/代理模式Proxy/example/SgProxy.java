package 结构型模式StructuralPattern7种.代理模式Proxy.example;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2021年02月20日5:03 PM
 * @Author xuejian.yxj
 */
public class SgProxy implements Specialty {
    private WySpecialty realSubject = new WySpecialty();
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest() {
        System.out.println("韶关代理婺源特产开始。");
    }
    public void postRequest() {
        System.out.println("韶关代理婺源特产结束。");
    }
}
