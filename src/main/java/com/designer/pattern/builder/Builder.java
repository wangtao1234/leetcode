package com.designer.pattern.builder;

/**
 * 抽象建造者
 *
 * @author wt
 * @date 2021/11/7
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.builder </li>
 * </ul>
 */
public abstract class Builder {

    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    abstract void buildD();

    abstract Product getProduct();
}
