package com.designer.pattern.mediator;

public abstract class Mediator {

    abstract void register(Colleague colleague);

    abstract void relay(Colleague colleague);
}
