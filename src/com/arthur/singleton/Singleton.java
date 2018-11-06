package com.arthur.singleton;

/**
 * 饿汉式单例
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() { // 构造方法私有化

    }

    public static Singleton getInstance() {
        return singleton;
    }
}
