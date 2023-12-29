package com.yinrj.singleton_design_pattern;

/**
 * 饿汉式的单例模式
 */
public class EarlySingleton {
    private static final EarlySingleton INSTANCE = new EarlySingleton();

    /**
     * 构造方法私有化，防止外部直接new对象
     */
    private EarlySingleton() {

    }

    public static EarlySingleton getInstance() {
        return INSTANCE;
    }
}
