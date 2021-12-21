package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wt
 * @date 2021/12/21
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class Test4 {
    public static void main(String[] args) {
        String content = "中国 aadf 的111萨 bbb 菲的 zz 萨菲";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < content.length(); i++) {
            Character c = content.charAt(i);
            Integer num = map.get(c);
            if (num == null) {
                num = 1;
            } else {
                num++;
            }
            map.put(c, num);
        }

        for (Map.Entry entry : map.entrySet()) {
            System.err.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
