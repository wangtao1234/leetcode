package com.test;

import java.lang.reflect.Field;

/**
 * @author wt
 * @date 2022/1/16
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class FruitInfoUtil {

    public static void getFruitInf(Class<?> clazz) {
        String strFruitProvicer = "供应商信息：";
        Field[] fields = clazz.getDeclaredFields();//通过反射获取处理注解
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer = " 供应商编号：" + fruitProvider.id() + " 供应商名称："
                        + fruitProvider.name() + " 供应商地址：" + fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }
}
