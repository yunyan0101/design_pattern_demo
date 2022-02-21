package 创建型模式CreatingPattern5种.单例模式Singleton.intro;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年12月09日11:51
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class LazySingleton0 {

    private static LazySingleton0 instance = null;

    private LazySingleton0() {}

    public static LazySingleton0 getInstance() {
        if (instance == null) {
            instance = new LazySingleton0();
        }
        return instance;
    }
}
