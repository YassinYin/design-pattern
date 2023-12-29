package com.yinrj.singleton_design_pattern;

/**
 * 静态内部类实现单例
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {}

    private static class SingletonHandle {
        private static final StaticInnerClassSingleton INSTANCE =
                new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHandle.INSTANCE;
    }
}
