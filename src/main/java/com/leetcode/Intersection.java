package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 */
public class Intersection {

    public int[] intersection(int[] num1, int[] num2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : num1) {
            set1.add(num);
        }
        for (int num : num2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] res = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            res[i++] = num;
        }
        return res;
    }
}
