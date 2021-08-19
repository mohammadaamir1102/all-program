package com.basic;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String address;
    int age;

    public Student(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        if(age==o.age)
            return 0;
        else if(age>o.age)
            return 1;
        else
            return -1;
    }

}
