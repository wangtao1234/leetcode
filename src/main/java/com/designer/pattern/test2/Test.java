package com.designer.pattern.test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wt
 * @date 2022/1/22
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.test2 </li>
 * </ul>
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,-2,3);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2){
                    return 1;
                }
                if (o1<o2){
                    return -1;
                }
                return 0;
            }
        });
        System.err.println(list);
    }


    public static String get() {
        String aa = "123";

        try {
            aa = aa + "123";
            return aa;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            aa = aa + "456";
            System.err.println(123);
        }
        return aa;
    }
}
