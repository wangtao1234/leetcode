package com.designer.pattern;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            LockSupport.park();//阻塞自己
            System.err.println("Thread end:" + Thread.currentThread().getName());
        });

        thread.setName("A");
        thread.start();
        System.err.println("Main thread sleep 3 seconds :" + Thread.currentThread().getId());
        TimeUnit.HOURS.sleep(3);
        LockSupport.unpark(thread);
    }
}
