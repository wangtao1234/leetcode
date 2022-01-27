package com.designer.pattern.newpattern.simpleFactory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.simpleFactory </li>
 * </ul>
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;
        if ("histogram".equals(type)) {
            chart = new HistogramChart();
        }
        if ("pie".equals(type)) {
            chart = new PieChart();
        }
        return chart;
    }
}
