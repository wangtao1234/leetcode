package com.test;

/**
 * @author wt
 * @date 2021/12/21
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class Test5 {


}


class Node {
    private int value;

    private Node left;

    private Node right;

    public void store(int value) {
        if (value < this.value) {
            if (left == null) {
                left = new Node();
                left.value = value;
            } else {
                left.store(value);
            }
        } else if (value > this.value) {
            if (right == null) {
                right = new Node();
                right.value = value;
            } else {
                right.store(value);
            }
        }
    }

    public boolean find(int value) {
        System.err.println("happen" + this.value);
        if (value == this.value) {
            return true;
        } else if (value > this.value) {
            if (right == null) {
                return false;
            }
            return right.find(value);
        }
        return true;
    }

}