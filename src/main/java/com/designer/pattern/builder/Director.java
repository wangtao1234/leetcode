package com.designer.pattern.builder;

/**
 * @author wt
 * @date 2021/11/7
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.builder </li>
 * </ul>
 */
public class Director {

    public Product create(Builder builder){
        builder.buildA();
        return builder.getProduct();
    }
}
