package com.leetcode;

import java.util.*;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 K 高的元素。
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 输入: nums = [1], k = 1
 * 输出: [1]
 */
public class TopN {
    public List<Integer> topFrequent(int[] nums, int k) {
        //建立hash映射
        Map<Integer, Integer> count = new HashMap<>();
        //频率统计
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        //建立优先级队列
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));
        //维护一个大小为k的已排序的优先队列
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        //返回结果
        List<Integer> top_k = new LinkedList<>();
        while (!heap.isEmpty()) {
            top_k.add(heap.poll());
        }
        return top_k;
    }
}
