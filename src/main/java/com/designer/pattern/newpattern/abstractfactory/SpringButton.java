package com.designer.pattern.newpattern.abstractfactory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.abstractfactory </li>
 * </ul>
 */
class SpringButton implements Button {


    @Override
    public void display() {
        System.err.println("显示浅绿色按钮");
    }
}
