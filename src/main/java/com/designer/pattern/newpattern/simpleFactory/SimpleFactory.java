package com.designer.pattern.newpattern.simpleFactory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.simpleFactory </li>
 * </ul>
 */
public class SimpleFactory {

    public static Product getProduct(String type) {
        Product product = null;
        if ("A".equals(type)) {
            product = new ConcreteProductA();
        }
        if ("B".equals(type)) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
