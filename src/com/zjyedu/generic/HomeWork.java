package com.zjyedu.generic;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class HomeWork {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",20000,new MyDate(2000,11,22)));
        employees.add(new Employee("jack",10000,new MyDate(1999,12,22)));
        employees.add(new Employee("zjy",30000,new MyDate(2000,5,9)));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if(!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    return 0;
                }
                int i = emp1.getName().compareTo(emp2.getName());
                if(i !=0) {
                    return i;
                }
               return (emp1.getBirthday().compareTo(emp2.getBirthday()));


            }
        });
        System.out.println(employees);


    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int mouth;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", mouth=" + mouth +
                ", day=" + day +
                '}';
    }



    @Override
    public int compareTo(MyDate o) {


                int yearM = year - o.getYear();
                if(yearM != 0){
                    return yearM;
                }
                int mouthM = mouth - o.getMouth();
                if(mouthM != 0){
                    return mouthM;
                }
                return (day - o.getDay());


            }
}