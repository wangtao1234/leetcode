package com.test;

/**
 * @author wt
 * @date 2021/12/23
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class Test8 {

    private static final char[] data = new char[]{'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};

    private static final char[] units = new char[]{'元', '拾', '佰', '仟', '万', '拾', '佰', '仟', '亿'};

    public static void main(String[] args) {
        System.err.println(convert(11234)+"整");
    }

    public static String convert(int money) {
        StringBuffer stringBuffer = new StringBuffer();
        int unit = 0;
        while (money != 0) {
            stringBuffer.insert(0, units[unit++]);
            int num = money % 10;
            stringBuffer.insert(0, data[num]);
            money /= 10;
            System.err.println(money);
        }
        return stringBuffer.toString();
    }
}
