package com.designer.pattern.command;

public class Kitchen {

    /**
     * 做面条
     */
    public void noodle(){
        System.out.println("正在做一碗美味的拉面。");
    }

    /**
     * 做馅饼
     */
    public void pie(){
        System.out.println("正在做一个香喷喷的馅饼");
    }

    public static void  main(String[] args){
        Kitchen kitchen = new Kitchen();
        NoodleCommand noodleCommand = new NoodleCommand(kitchen);
        PieCommand pieCommand = new PieCommand(kitchen);
        Waiter waiter = new Waiter();
        waiter.setNoodleCommand(noodleCommand);
        waiter.setPieCommand(pieCommand);

        // 客人A：服务员您好，我想来碗面
        waiter.noodleCommandExecute();
        // 客人B：服务员您好，我要来个馅饼
        waiter.pieCommandExecute();
        // 客人C：服务员您好，给我来碗面
        waiter.noodleCommandExecute();

    }
}
