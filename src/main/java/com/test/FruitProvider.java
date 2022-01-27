package com.test;

/**
 * @author wt
 * @date 2022/1/16
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public @interface FruitProvider {

    /**
     * 供应商编号
     */
    int id() default -1;

    /**
     * 供应商名称
     */
    String name() default "";

    /**
     * 供应商地址
     */
    String address() default "";


}
