package com.zjyedu.generic;

import java.util.*;

public class Generic01 {
    public static void main(String[] args) {
        //使用泛型
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",28));
        students.add(new Student("mary",19));

        for (Student student :students) {
            System.out.println(student);
        }
        HashMap<String, Student> hm = new HashMap<>();
        hm.put("milan",new Student("milan",28));
        hm.put("smith",new Student("smith",28));
        hm.put("zjy",new Student("zjy",28));
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next);

        }


    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}