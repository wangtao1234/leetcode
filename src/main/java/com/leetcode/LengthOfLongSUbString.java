package com.leetcode;

import java.util.HashMap;

public class LengthOfLongSUbString {

    public int lengthOfLongSubString(String s) {
            char[] chars = s.toCharArray();//转为字符数组
            if (chars.length == 0) return 0;
            HashMap<Character, Integer> map = new HashMap<>();//建立哈希映射
            int size = s.length(), count = 0, i = 0;
            for (int j = 0; j < size; j++) {//遍历字符
                if (map.containsKey(chars[j]))//如果映射中存在该字符
                    i = Math.max(map.get(chars[j]), i);//更新滑动窗口的左边界 i
                count = Math.max(count, j - i+1);//更新 count 为最大值
                map.put(chars[j], j + 1);//更新映射中该字符映射的 Value 值为当前位置加一
            }
            return count;//返回最大累加总数, 需要加 1
    }
}
