package com.yinrj.singleton_design_pattern;

/**
 * 双重检查懒汉式单例
 */
public class DoubleCheckSingleton {
    /**
     * 使用volatile修饰是为了防止指令重排带来的线程安全问题
     */
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
