package com.designer.pattern.chain;

import com.designer.pattern.command.Command;

public class Main {
    public static void main(String[] args) {


        AbstractFilter brushTooth =  new AbstractFilter(){
            @Override
            public void exec0(Command command) {
                System.out.println("刷牙。。。。");
            }
        };

        AbstractFilter washFace =  new AbstractFilter(){
            @Override
            public void exec0(Command command) {
                System.out.println("洗脸。。。。");
            }
        };

        AbstractFilter loggerFilter =  new AbstractFilter(){
            @Override
            public void exec0(Command command) {
                System.out.println("记录日志到Es");
            }
        };


        AbstractFilter commandExecutor =  new AbstractFilter(){
            @Override
            public void exec0(Command command) {
                System.out.println("执行命令！！！");
                command.execute();
            }
        };


        FilterPipeline pipeline = new FilterPipeline();
        pipeline.addLast(brushTooth);
        pipeline.addLast(washFace);
        pipeline.addLast(commandExecutor);
        pipeline.exec(new Command() {
            @Override
            public void execute() {
                System.out.println("命令被执行。。。。。。。");
            }
        });
    }
}
