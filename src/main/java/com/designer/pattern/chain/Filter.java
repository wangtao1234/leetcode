package com.designer.pattern.chain;

import com.designer.pattern.command.Command;

public interface Filter {
    void exec(Command command);
}
