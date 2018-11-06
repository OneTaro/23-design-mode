package com.arthur.singleton;

/**
 * 懒汉式单例
 */
public class Singleton2 {
    private static volatile Singleton2 singleton = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
