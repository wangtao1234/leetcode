package com.sort;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wt
 * @date 2021/12/20
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.sort </li>
 * </ul>
 */
public class ThreadTest {

    private static Lock lock = new ReentrantLock();
    private static Condition subThreadConditon = lock.newCondition();
    private static boolean bBhouldSubThread = false;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    lock.lock();
                    try {
                        if (!bBhouldSubThread) {
                            subThreadConditon.await();
                        }
                        for (int j = 0; j < 10; j++) {
                            System.err.println(Thread.currentThread().getName() + "j=" + j);
                        }
                        bBhouldSubThread = false;
                        subThreadConditon.signal();
                    } catch (Exception e) {

                    } finally {
                        lock.unlock();
                    }
                }
            }
        });
        threadPool.shutdown();
        for (int i=0;i<50;i++){
            lock.lock();
            try {
                if (bBhouldSubThread){
                    subThreadConditon.await();
                }
                for (int j=0;j<100;j++){
                    System.err.println(Thread.currentThread().getName()+"j="+j);
                }
                bBhouldSubThread=true;
                subThreadConditon.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
