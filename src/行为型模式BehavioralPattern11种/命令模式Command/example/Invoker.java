package 行为型模式BehavioralPattern11种.命令模式Command.example;

/**
 * @Project design_pattern_demo
 * @Description
 * @Create 2022年02月21日7:38 PM
 * @Author xuejian.yxj
 */
public class Invoker {

    private Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
