package 行为型模式BehavioralPattern11种.命令模式Command.example;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2022年02月21日7:38 PM
 * @Author xuejian.yxj
 */
public class CommandPattern {

    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }

}
