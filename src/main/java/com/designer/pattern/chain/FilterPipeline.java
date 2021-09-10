package com.designer.pattern.chain;

import com.designer.pattern.command.Command;

public class FilterPipeline implements Filter{

    private HeadFilter head;

    private AbstractFilter pre;

    private TailFilter tail;

    public FilterPipeline() {
        head = new HeadFilter();
        tail = new TailFilter();
        pre = head;
        head.next = tail;
    }

    @Override
    public void exec(Command command) {
        head.exec(command);
    }

    public void addLast(AbstractFilter filter){
        pre.next = filter;
        filter.next = tail;
        pre = filter;
    }
}
