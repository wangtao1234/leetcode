package com.designer.pattern.command;

public class NoodleCommand implements Command {

    private Kitchen kitchen;

    public NoodleCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.noodle();
    }
}
