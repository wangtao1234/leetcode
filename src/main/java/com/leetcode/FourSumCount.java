package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 四数求和
 */
public class FourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; i++) {
                int sum = A[i] + B[j];
                // key 为两个数组中元素组合值之和, value 为两数和的值出现的次数
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                // 找到满足条件的 key , 总次数与对应 value 值累加 (因为value 代表 A, B 数组中符合条件的组合的次数)
                count += map.getOrDefault(-C[i] - D[j], 0);
            }
        }
        return count;
    }
}
