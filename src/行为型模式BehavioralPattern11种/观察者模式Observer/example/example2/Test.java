package 行为型模式BehavioralPattern11种.观察者模式Observer.example.example2;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年09月29日13:56
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class Test {
    public static void main(String[] args) {
        Bell bell = new Bell();
        Student student = new Student();
        Teacher teacher = new Teacher();
        bell.addObserver(student);
        bell.addObserver(teacher);
        bell.rings(RingTypeEnum.BEGINS);
        bell.rings(RingTypeEnum.ENDS);
    }
}
