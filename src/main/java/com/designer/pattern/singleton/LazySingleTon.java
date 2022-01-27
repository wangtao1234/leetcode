package com.designer.pattern.singleTon;

/**
 * @author wt
 * @date 2021/11/7
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.singleTon </li>
 * </ul>
 */
public class LazySingleTon {

    private static LazySingleTon instance;

    private LazySingleTon() {

    }

    /**
     * 双重检查
     *
     * @return
     */
    public static LazySingleTon getInstance() {
        if (instance == null) {
            synchronized (LazySingleTon.class) {
                if (instance == null) {
                    return new LazySingleTon();
                }
            }
        }
        return instance;
    }

    /**
     * 内部类
     */
    private static class singleTonClassInstance {
        private static final LazySingleTon instance = new LazySingleTon();
    }

    public static LazySingleTon getInstanceV2() {
        return singleTonClassInstance.instance;
    }
}
