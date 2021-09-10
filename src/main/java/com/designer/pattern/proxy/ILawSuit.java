package com.designer.pattern.proxy;

/**
 * 诉讼类
 */
public interface ILawSuit {

    /**
     * 提起
     * @param proof
     */
    void submit(String proof);

    /**
     * 辩护
     */
    void defend();

}
