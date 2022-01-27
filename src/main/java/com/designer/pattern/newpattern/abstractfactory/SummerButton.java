package com.designer.pattern.newpattern.abstractfactory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.abstractfactory </li>
 * </ul>
 */
class SummerButton implements Button {
    @Override
    public void display() {
        System.err.println("显示浅蓝色按钮");
    }
}
