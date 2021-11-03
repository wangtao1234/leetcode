package com.designer.pattern.singleton;

/**
 * 懒汉模式(双重检查锁)
 */
public class LazySingleTon {

    private static LazySingleTon singleTon = null;

    private LazySingleTon() {

    }

    /**
     * 双重检查锁
     */
    public static LazySingleTon getInstance() {
        if (singleTon == null) {
            synchronized (LazySingleTon.class) {
                if (singleTon == null) {
                    singleTon = new LazySingleTon();
                }
            }
        }
        return singleTon;
    }

    /**
     * 静态内部类
     */
    public static LazySingleTon getInstanceV2() {
        return StaticSingletonHolder.instance;
    }


    /**
     * 静态内部类
     */
    private static class StaticSingletonHolder {
        private static final LazySingleTon instance = new LazySingleTon();
    }
}
