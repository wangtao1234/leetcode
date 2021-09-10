package com.designer.pattern.command;

public class PieCommand implements Command {

    /**
     * 持有真正命令的接收者
     */
    private Kitchen kitchen;

    public PieCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }


    @Override
    public void execute() {
        kitchen.pie();
    }
}
