package com.yinrj.singleton_design_pattern;

/**
 * 懒汉式单例模式
 */
public class LockMethodSingleton {
    private static LockMethodSingleton instance;

    private LockMethodSingleton() {

    }

    /**
     * 通过直接锁住方法来解决线程不安全问题
     * @return instance
     */
    public static synchronized LockMethodSingleton getInstance() {
        if (instance == null) {
            instance = new LockMethodSingleton();
        }
        return instance;
    }
}
