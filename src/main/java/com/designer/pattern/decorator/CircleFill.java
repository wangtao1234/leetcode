package com.designer.pattern.decorator;

/**
 * 具体装饰器
 */
public class CircleFill extends Decorator {

    public CircleFill(Shape shape) {
        super(shape);
    }

    private void setEdgeFill() {
        System.out.println(",content with color");
    }

    public void draw() {
        shape.draw();
        setEdgeFill();
    }
}
