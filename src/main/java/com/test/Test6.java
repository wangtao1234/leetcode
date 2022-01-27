package com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author wt
 * @date 2021/12/21
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class Test6 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\427.txt"), "utf-8"));
        String lines = null;
        while ((lines = br.readLine()) != null) {
            String user = lines;
            String[] userArry = user.split(",");
            if (map.containsKey(userArry[1])) {
                map.put(userArry[1], map.get(userArry[1]) + 1);
            } else {
                map.put(userArry[1], 1);
            }
        }
        Set<String> nameSet = new HashSet<String>();
        for (String key : map.keySet()) {
            nameSet.add(key);
        }
        System.out.println("所有的用户:" + nameSet);
        HashMap<String, Integer> chongfumap = new HashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                chongfumap.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("重复map:" + chongfumap);


        // 升序比较器
        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();

            }

        };
        // map转换成list进行排序
        List<Map.Entry<String, Integer>> list = new ArrayList<>(chongfumap.entrySet());
        // 排序
        Collections.sort(list, valueComparator);
        System.out.println("排序开始");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("排序结束");

    }
}

