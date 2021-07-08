package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 只出现一次的数
 */
public class SingleNum {

    public int singleNum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            count = count == null ? 1 : ++count;
            //count 为null时证明元素不存在，则频率改为1，否则频率加1
            //加入映射表
            map.put(num, count);
        }
        for (Integer num : map.keySet()) {
            if (map.get(num) == 1)
                return num;
        }
        return 0;
    }
}
