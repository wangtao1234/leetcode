package com.designer.pattern.command;

public class Waiter {

    /**
     * 做面条的命令
     */
    private Command noodleCommand;

    /**
     * 做馅饼命令
     */
    private Command pieCommand;


    public void noodleCommandExecute() {
        noodleCommand.execute();
    }

    public void pieCommandExecute() {
        pieCommand.execute();
    }

    public void setNoodleCommand(Command noodleCommand) {
        this.noodleCommand = noodleCommand;
    }

    public void setPieCommand(Command pieCommand) {
        this.pieCommand = pieCommand;
    }
}
