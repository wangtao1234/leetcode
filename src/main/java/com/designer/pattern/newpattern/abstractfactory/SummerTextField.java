package com.designer.pattern.newpattern.abstractfactory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.abstractfactory </li>
 * </ul>
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.err.println("显示蓝色边框文本框");
    }
}
