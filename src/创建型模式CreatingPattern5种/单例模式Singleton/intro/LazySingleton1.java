package 创建型模式CreatingPattern5种.单例模式Singleton.intro;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年12月02日11:25
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class LazySingleton1 {

    private static LazySingleton1 instance = null;

    private LazySingleton1() {}

    public static synchronized LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }
}
