package com.leetcode;

import java.util.Stack;

public class DecodeString {


    public String decodeString(String s) {
        //初始化数据结构
        Stack<StringBuffer> str = new Stack<>();
        Stack<Integer> nums = new Stack<>();
        StringBuffer res = new StringBuffer();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                str.push(res);//入栈
                nums.push(num);
                num = 0;
                res = new StringBuffer();
            } else if (c == ']') {
                StringBuffer tmp = new StringBuffer();
                for (int i = nums.pop(); i > 0; i--) {
                    tmp.append(res);
                }
                res = str.pop().append(tmp);
            } else if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } else res.append(c);
        }
        return res.toString();
    }

    /**
     * 递归
     */
    private int i = -1;//全局变量i，记录字符数组指针位置

    public String decodeStringV2(String s) {
        return dfs(s.toCharArray(), s.length()).toString();
    }

    private StringBuilder dfs(char[] chars, int len) {
        int num = 0;
        StringBuilder str = new StringBuilder();
        while (++i < len) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num = num * 10 + (chars[i] - '0');
            } else if (chars[i] == '[') {
                StringBuilder tmp = dfs(chars, len);
                while (--num >= 0) {
                    str.append(tmp);
                }
                num = 0;
            } else if (chars[i] == ']') {
                return str;
            } else {
                str.append(chars[i]);
            }
        }
        return str;
    }
}
