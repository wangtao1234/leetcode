package com.designer.pattern.mediator;

import java.util.List;

public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues;

    @Override
    void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleague.setMediator(this);
            this.colleagues.add(colleague);
        }
    }

    @Override
    void relay(Colleague colleague) {
        colleagues.forEach(c -> {
            if (!c.equals(colleague)) {
                c.receive();
            }
        });
    }
}
