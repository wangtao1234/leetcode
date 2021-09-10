package com.designer.pattern.mediator;

public abstract class Colleague {

    protected Mediator mediator;

    public abstract void receive();

    public abstract void send();

    public void setMediator(ConcreteMediator concreteMediator) {
        this.mediator = mediator;
    }
}
