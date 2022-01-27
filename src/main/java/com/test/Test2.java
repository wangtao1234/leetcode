package com.test;

import java.io.*;

/**
 * @author wt
 * @date 2021/12/21
 * <ul>
 * <li> project: leetcode </li>
 * <li> package: com.test </li>
 * </ul>
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\javatest\\");
        if (!file.exists() && !file.isDirectory()) {
            throw new Exception("文件目录不存在");
        }
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        File destDir = new File("D:\\jad\\");
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        for (File file1 : files) {
            InputStream inputStream = new FileInputStream(file1);
            String destFileName = file1.getName().replaceAll("\\.java$", ".jad");
            FileOutputStream fileOutputStream = new FileOutputStream(new File(destDir, destFileName));
            copy(inputStream,fileOutputStream);
            inputStream.close();
            fileOutputStream.close();
        }
    }

    private static void copy(InputStream inputStream, OutputStream outputStream)  throws Exception{
        int len = 0;
        byte[] buf = new byte[1024];
        while ((len = inputStream.read(buf)) != -1) {
            outputStream.write(buf,0,len);
        }
    }
}
