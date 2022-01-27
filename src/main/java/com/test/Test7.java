package com.test;

/**
 * @author wt
 * @date 2021/12/21
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class Test7 {

    public static void main(String[] args) {
        System.err.println(computeAge(8));
    }

    public static int computeAge(int n) {
        if (n == 1) {
            return 10;
        }
        return computeAge(n - 1) + 2;
    }
}
