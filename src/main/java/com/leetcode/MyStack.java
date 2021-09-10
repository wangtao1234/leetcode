package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /**
     * 指向栈顶元素
     */
    private int top;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
        top = x;
    }

    public int pop() {
        //条件为队列1的元素个数大于1
        while (queue1.size() > 1) {
            //用top暂存元素，当循环结束时，top刚好时栈顶元素
            top = queue1.poll();
            queue2.add(top);
        }
        //队列1与队列2交换
        Queue<Integer> tmp = queue2;
        queue2 = queue1;
        queue1 = tmp;
        return queue2.poll();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
