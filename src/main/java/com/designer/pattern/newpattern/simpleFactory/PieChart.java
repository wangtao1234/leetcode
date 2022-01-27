package com.designer.pattern.newpattern.simpleFactory;


/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.simpleFactory </li>
 * </ul>
 */
class PieChart implements Chart {

    public PieChart() {
        System.err.println("创建饼图");
    }

    @Override
    public void display() {
        System.err.println("显示饼图");
    }
}
