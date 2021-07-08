package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 两数之和()
     * 两次遍历法：第一次遍历把所有元素及其索引保存到哈希映射，第二次遍历查找 target - x 相等的目标元素
     * 一次遍历法：假如 y = target - x，则 x = target -y，所以一次遍历 在存入哈希映射的同时查找是否存在一个值与 target - x 相等的目标元素。
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.containsKey(res) && map.get(res) != i) {
                return new int[]{i, map.get(res)};
            }
        }
        return null;
    }

    public int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.containsKey(res)) {
                return new int[]{i, map.get(res)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
