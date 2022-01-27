package com.designer.pattern.newpattern.Factory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.Factory </li>
 * </ul>
 * 具体产品
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.err.println("数据库写日志");
    }
}
