package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumJewelsInStones {

    /**
     * @param j 代表宝石的类型
     * @param s 代表拥有的石头
     * @return 宝石的数量
     */
    public int numJewelsInstones(String j, String s) {
        Set<Character> set = new HashSet<>();
        for (char c : j.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
