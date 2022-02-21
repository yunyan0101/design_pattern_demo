package 创建型模式CreatingPattern5种.单例模式Singleton.example.example1;

/**
 * @Project design_pattern_demo
 * @Description
 * @Company youku
 * @Create 2019年12月09日11:56
 * @Author xuejian.yxj
 * @Version 1.0 Copyright (c) 2019 youku, All Rights Reserved.
 */
public class President {
    
    private volatile static President instance = null;

    private President() {}

    public static President getInstance() {
        if (instance == null) {
            synchronized (President.class) {
                if (instance == null) {
                    instance = new President();
                }
            }
        }
        return instance;
    }
}
