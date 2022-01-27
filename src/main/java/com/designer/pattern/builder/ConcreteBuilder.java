package com.designer.pattern.builder;

/**
 * @author wt
 * @date 2021/11/7
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.builder </li>
 * </ul>
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
