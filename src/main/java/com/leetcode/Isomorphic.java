package com.leetcode;


import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 */
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s_map = new HashMap<>();
        Map<Character, Character> t_map = new HashMap<>();
        char[] s_chars = s.toCharArray(), t_chars = t.toCharArray();
        for (int i = 0; i < s_chars.length; i++) {
            //两种不成立的情况
            if (s_map.containsKey(s_chars[i]) && s_map.get(s_chars[i]) != t_chars[i]) {
                return false;
            }
            if (t_map.containsKey(t_chars[i]) && t_map.get(t_chars[i]) != s_chars[i]) {
                return false;
            }
            s_map.put(s_chars[i], t_chars[i]);
            t_map.put(t_chars[i], s_chars[i]);
        }
        return true;
    }

    public boolean isIsomorphicV2(String s, String t) {
        Map<Character, Character> map = new HashMap<>();// 一个哈希映射
        char[] s_chars = s.toCharArray(), t_chars = t.toCharArray();
        for (int i = 0; i < s_chars.length; i++) {
            if (map.containsKey(s_chars[i]) && map.get(s_chars[i]) != t_chars[i]) return false;
            // 判断t中字符是否存在于映射中的 values 内
            if (!map.containsKey(s_chars[i]) && map.containsValue(t_chars[i])) return false;
            map.put(s_chars[i], t_chars[i]);
        }
        return true;
    }


}
