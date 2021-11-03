package com.designer.pattern.decorator;

public class Demo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Decorator circleFill = new CircleFill(circle);
        circleFill.draw();
    }
}
