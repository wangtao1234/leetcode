package com.designer.pattern.chain;

import com.designer.pattern.command.Command;

public abstract class AbstractFilter implements Filter {
    public Filter next;
    public void exec(Command command){
        exec0(command);
        if(next != null) {
            next.exec(command);
        }
    }
    public abstract void exec0(Command command);
}
