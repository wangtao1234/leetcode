package com.designer.pattern.decorator;

/**
 * 被装饰的类
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("a circle");
    }
}
