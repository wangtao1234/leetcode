package com.designer.pattern.singleton;

/**
 * @author wangtao
 */
public class EnumSingleTon {

    public static void main(String[] args) {
        Single single = Single.SINGLE;
        single.Single();
    }

    enum Single {
        SINGLE;

        public void Single() {
            System.err.println("枚举单例模式");
        }
    }
}
