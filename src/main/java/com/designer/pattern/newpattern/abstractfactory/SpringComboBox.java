package com.designer.pattern.newpattern.abstractfactory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.abstractfactory </li>
 * </ul>
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.err.println("显示绿色边框组合框");
    }
}
