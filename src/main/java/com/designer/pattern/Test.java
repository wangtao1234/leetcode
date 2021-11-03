package com.designer.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(20160001, "孔明", 20, "土木工程", "武汉大学"));
        list.add(new Student(20160002, "伯约", 21, "信息安全", "武汉大学"));
        list.add(new Student(20160003, "玄德", 22, "经济管理", "武汉大学"));
        list.add(new Student(20160004, "云长", 21, "信息安全", "武汉大学"));
        list.add(new Student(20161001, "翼德", 21, "机械与自动化", "华中科技大学"));
        list.add(new Student(20161002, "元直", 23, "土木工程", "华中科技大学"));
        list.add(new Student(20161003, "奉孝", 23, "计算机科学", "华中科技大学"));
        list.add(new Student(20161009, "元直", 27, "土木工程", "华南科技大学"));

        //filter
        List<Student> whuStudent = list.stream().filter(student -> "武汉大学".equals(student.getCollege())).collect(Collectors.toList());
//        System.out.println(whuStudent.toString());

        List<Integer> evens = new ArrayList<>();
        evens.add(1);
        evens.add(2);
        evens.add(3);
        evens.add(4);
        evens.add(5);
        evens.add(6);
        evens.add(7);
        evens.add(2);
        evens.add(2);
        evens.add(2);
        evens.add(2);
        //distinct
        List<Integer> students = evens.stream().filter(num -> num % 2 == 0).distinct().collect(Collectors.toList());
//        System.err.println(students.toString());

        //limit
        List<Student> students1 = list.stream().filter(student -> "土木工程".equals(student.getProfession()))
                .limit(2).collect(Collectors.toList());
//        System.err.println(students1.toString());

        //flapMap
        String[] strs = {"java8", "is", "easy", "to", "use"};
        List<String[]> distinctStrs = Arrays.stream(strs)
                .map(str -> str.split(""))  // 映射成为Stream<String[]>
                .distinct()
                .collect(Collectors.toList());
        System.err.println(distinctStrs.toString());

        List<String> distinctStrs1 = Arrays.stream(strs)
                .map(str -> str.split(""))  // 映射成为Stream<String[]>
                .flatMap(Arrays::stream)  // 扁平化为Stream<String>
                .distinct()
                .collect(Collectors.toList());
        System.err.println(distinctStrs1);

        int[] intArray = {12,3,34,67,100,99};

    }
}


class Student {

    public Student(Integer code, String name, Integer num, String profession, String college) {
        this.code = code;
        this.name = name;
        this.num = num;
        this.profession = profession;
        this.college = college;
    }

    /**
     * 学号
     */
    private Integer code;

    /**
     * 姓名
     */
    private String name;

    /**
     * 编号
     */
    private Integer num;

    /**
     * 专业
     */
    private String profession;

    /**
     * 大学
     */
    private String college;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", profession='" + profession + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
