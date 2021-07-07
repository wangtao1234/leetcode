package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
 * 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。如果答案不止一个，则输出所有答案并且不考虑顺序。你可以假设总是存在一个答案。
 */
public class FindRestaurant {

    public String[] findRestaurant(String[] list1, String[] list2) {
        //建立hash映射
        Map<String, Integer> map = new HashMap<>();
        //初次遍历将一个数组建立映射关系
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        //待返回的目标数组
        List<String> res = new ArrayList<>();
        //sum为当前满足条件的最小索引和
        int sum = Integer.MAX_VALUE;
        {
            //第二次遍历查找目标元素
            for (int i = 0; i < list2.length; i++) {
                if (map.containsKey(list2[i])) {
                    //当前索引和
                    int tmp = i + map.get(list2[i]);
                    //如果当前索引和更小
                    if (tmp < sum) {
                        ///清除目标数组
                        res.clear();
                        //添加该元素
                        res.add(list2[i]);
                        //刷新最小索引和
                        sum = tmp;
                    } else if (tmp == sum) {
                        //如果索引和相等
                        res.add(list2[i]);
                    }
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
