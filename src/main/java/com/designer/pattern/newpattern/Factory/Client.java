package com.designer.pattern.newpattern.Factory;

/**
 * @author wt
 * @date 2022/1/27
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.designer.pattern.newpattern.Factory </li>
 * </ul>
 */
public class Client {

    public static void main(String[] args){
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory = new FileLoggerFactory();
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
