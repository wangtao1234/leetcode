package com.designer.pattern.decorator;

/**
 * 具体装饰器对象
 */
public class CircleEdge extends Decorator {


    public CircleEdge(Shape shape) {
        super(shape);
    }

    private void setEdgeColor() {
        System.out.println(",edge with color");
    }

    public void draw() {
        shape.draw();
        setEdgeColor();
    }
}
