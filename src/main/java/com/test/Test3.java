package com.test;

import java.io.UnsupportedEncodingException;

/**
 * @author wt
 * @date 2021/12/21
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class Test3 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我";
        int num = trimGBK(str.getBytes("GBK"), 2);
        System.out.println(num);
        System.out.println(str.substring(0, num));
    }

    public static int trimGBK(byte[] buf, int n) {
        int num = 0;
        boolean bChineseFirstHalf = false;
        for (int i = 0; i < 2; i++) {
            if (buf[i] < 0 && !bChineseFirstHalf) {
                bChineseFirstHalf = true;
            } else {
                num++;
                bChineseFirstHalf = false;
            }
        }
        return num;
    }
}
