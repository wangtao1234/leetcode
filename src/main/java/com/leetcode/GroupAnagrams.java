package com.leetcode;

import java.util.*;

/**
 * 字母异位词分组 Group Anagrams
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strts) {
        if (strts.length == 0) {
            return new ArrayList<>();
        }
        //建立hash映射关系
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strts) {
            //字符串转成字符数组
            char[] chs = s.toCharArray();
            //排序
            Arrays.sort(chs);
            //转成字符串
            String key = String.valueOf(chs);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
        }
        return new ArrayList<>();
    }
}
