package com.designer.pattern.builder;

/**
 * @author wangtao
 */
public interface Builder {

    /**
     * 打地基
     */
    void buildBasic();


    /**
     * 砌墙
     */
    void buildWalls();

    /**
     * 封顶
     */
    void roofed();

    /**
     * 造房子
     *
     * @return 返回值
     */
    Product buildProduct();

}
