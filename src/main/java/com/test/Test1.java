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
public class Test1 {

    public static void main(String[] args) throws Exception {
        File fileA = new File("D:\\A.txt");
        File fileB = new File("D:\\B.txt");
        File fileC = new File("D:\\C.txt");
        Test1 test1  = new Test1();
        test1.connectWords(fileA,fileB,fileC);
    }

    public String[] split(File file, String regex) throws IOException {
        FileReader fileReader = new FileReader(file);
        char[] buf = new char[(int) file.length()];
        int hasRead = fileReader.read(buf);
        String str = new String(buf, 0, hasRead).replaceAll("\\r","")
                .replaceAll("\\n","");
        String[] strArr = str.split(regex);
        return strArr;
    }

    public void connectWords(File file1, File file2, File file3) throws Exception {
        String[] str = split(file1, "\n");
        String[] str2 = split(file2, "\n" + "|" +" ");
        FileWriter fileWriter = new FileWriter(file3);
        try {
            int index = 0;
            while (index != str.length || index != str2.length) {
                if (index < str.length) {
                    fileWriter.write(str[index]);
                }
                if (index < str2.length) {
                    fileWriter.write(str2[index]);
                }
                index++;
            }
        } catch (Exception e) {

        }
        fileWriter.close();
    }
}
