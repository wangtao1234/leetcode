package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        //转成 Char 数组
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : chars) {
            //转成 Char 数组
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            //找到词频为1的字母(只出现一次)返回其索引
            if (map.get(chars[i]) == i) {
                return i;
            }
        }
        return -1;
    }
}
