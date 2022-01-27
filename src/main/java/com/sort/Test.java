package com.sort;

/**
 * @author wt
 * @date 2021/12/20
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.sort </li>
 * </ul>
 */
public class Test {
    public static void main(String[] args) {
        System.err.println(test());
    }

    public static int test() {
        int num = 10;
        try {
            System.out.println("try");
            num += 80;
            return num;
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            if (num > 20) {
                num = 100;
                System.out.println("num>20 : " + num);
            }
            System.out.println("finally");
        }
        return num;
    }
}
