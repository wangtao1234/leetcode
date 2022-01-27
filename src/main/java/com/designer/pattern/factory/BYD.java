package com.designer.pattern.factory;

/**
 * @author wt
 * @date 2021/11/7
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.factory </li>
 * </ul>
 */
public class BYD implements SimpleFactory {
    @Override
    public void getCar() {
        System.err.println("来一辆比亚迪");
    }
}
