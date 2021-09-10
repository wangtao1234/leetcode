package com.designer.pattern.chain;

import com.designer.pattern.command.Command;

public class TailFilter extends  AbstractFilter{
    @Override
    public void exec0(Command command) {
        System.out.println("责任链结束");
    }
}
