package com.designer.pattern.adapter;

public class NbLoggerImpl implements NbLogger {

    @Override
    public void d(int priority, String message, Object... objects) {
        System.out.println(String.format("牛逼logger记录:%s", message));
    }
}
