package 创建型模式CreatingPattern5种.单例模式Singleton.intro;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年12月09日11:38
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
