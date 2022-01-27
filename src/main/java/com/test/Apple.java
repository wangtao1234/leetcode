package com.test;

/**
 * @author wt
 * @date 2022/1/16
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class Apple {
    @FruitProvider(id = 1,name = "陕西市",address = "延安")
    private String appleProver;

    public String getAppleProver() {
        return appleProver;
    }

    public void setAppleProver(String appleProver) {
        this.appleProver = appleProver;
    }
}
