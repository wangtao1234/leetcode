package com.designer.pattern.singleton;

/**
 * 单例 饿汉模式
 * @author wangtao
 */
public class HungerSingleTon {

    private static final HungerSingleTon instance = new HungerSingleTon();

    private HungerSingleTon() {

    }

    public static HungerSingleTon getInstance() {
        return instance;
    }
}
