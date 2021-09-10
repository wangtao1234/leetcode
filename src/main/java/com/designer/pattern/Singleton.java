package com.designer.pattern;

/**
 * 单例模式
 */
public class Singleton {

    private static final Singleton single = new Singleton();

    private Singleton() {

    }

    public Singleton getSingle() {
        return single;
    }
}
