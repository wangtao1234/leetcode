package com.leetcode;


import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 常数时间插入、删除和获取随机元素 Insert Delete GetRandom O(1)
 */
public class RandomizedSet {

    List<Integer> list;

    Map<Integer, Integer> map;

    Random random;

    /**
     * 插入操作
     *
     * @param val 入参
     * @return 返回值
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        //val代表存在list的下标索引
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /**
     * 删除数据
     *
     * @param val 入参
     * @return 返回值
     */
    public boolean remove(int val) {
        //如果hash中不存在该键值,直接返回false
        if (!map.containsKey(val)) {
            return false;
        }
        //暂存数组最后一位元素值
        int tmp = list.get(list.size() - 1);
        //获取待删除元素在 list 数组中对应的索引下标 index
        int index = map.get(val);
        //将 list 中该元素值改为暂存的数组最后一位值
        list.set(index, tmp);
        //更新哈希映射中代表数组最后一位的键值对 对应的索引下标为 index
        map.put(tmp, index);
        //删除数组最后一位
        list.remove(list.size() - 1);
        //删除哈希映射中该键值对
        map.remove(val);
        return true;
    }

    /**
     * 获取随机值
     *
     * @return 返回值
     */
    public int getRandom() {
        // 产生一个大小为 [0, 数组大小) 的随机索引下标
        return list.get(random.nextInt(list.size()));
    }
}
