package com.designer.pattern;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test3 {

    private static Lock lock = new ReentrantLock(true);

    private static Condition ca = lock.newCondition();
    private static Condition cb = lock.newCondition();
    private static Condition cc = lock.newCondition();

    private static volatile int idx = 0;

    public static void main(String[] args) {
        new Thread(new A()).start();
        new Thread(new B()).start();
        new Thread(new C()).start();
    }

    private static class A implements Runnable {

        @Override
        public void run() {
            int g = 0;
            try {
                lock.lock();
                for (int i = 0; i < 10; i++) {
                    g++;
                    cb.signalAll();
                    System.err.println("a:" + (++idx));
                    ca.await();
                }
            } catch (InterruptedException e) {
                System.err.println(e);
            } finally {
                System.err.println("0000000000000" + g);
                lock.unlock();
            }
        }
    }

    private static class B implements Runnable {

        @Override
        public void run() {
            int g = 0;
            try {
                lock.lock();
                for (int i = 0; i < 10; i++) {
                    g++;
                    cc.signalAll();
                    System.err.println("b:" + (++idx));
                    cb.await();
                }
            } catch (InterruptedException e) {
                System.err.println(e);
            } finally {
                System.err.println("11111111111" + g);
                lock.unlock();
            }
        }
    }

    private static class C implements Runnable {
        @Override
        public void run() {
            int g = 0;
            try {
                lock.lock();
                for (int i = 0; i < 10; i++) {
                    g++;
                    ca.signalAll();
                    System.out.println("c: " + (++idx));
                    cc.await();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.err.println("22222222222" + g);
                lock.unlock();
            }
        }
    }
}



