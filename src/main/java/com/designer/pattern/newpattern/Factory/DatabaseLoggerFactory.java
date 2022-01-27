package com.designer.pattern.newpattern.Factory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.Factory </li>
 * </ul>
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
