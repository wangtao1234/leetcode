package com.designer.pattern.newpattern.simpleFactory;

/**
 * 简单工程模式（静态工厂模式）
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern </li>
 * </ul>
 */
public abstract class Product {

    /**
     * 所有产品得公共类
     */
    public void methodSame(){
        //公共方法实现
    }

    //声明抽象业务方法
    public abstract void methodDiff();
}
