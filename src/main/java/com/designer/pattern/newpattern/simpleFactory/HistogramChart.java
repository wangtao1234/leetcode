package com.designer.pattern.newpattern.simpleFactory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.simpleFactory </li>
 * </ul>
 */
class HistogramChart implements Chart {

    public HistogramChart() {
        System.err.println("创建柱状图");
    }


    @Override
    public void display() {
        System.err.println("显示柱状图");
    }
}
