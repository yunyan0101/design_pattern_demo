package 行为型模式BehavioralPattern11种.命令模式Command.example;

/**
 * @Project design_pattern_demo
 * @Description 具体命令
 * @Create 2022年02月21日7:39 PM
 * @Author xuejian.yxj
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    public void execute() {
        receiver.action();
    }
}
