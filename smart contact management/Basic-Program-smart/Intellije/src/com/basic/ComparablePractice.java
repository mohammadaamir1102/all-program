package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePractice {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Collections.addAll(list,
                new Student(32, "aamir khan", "basti", 33),
                new Student(43, "aasim khan", "basti", 18),
                new Student(8, "aaquib khan", "basti", 12),
                new Student(12, "all student", "google meet", 25)
        );
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student.id+" "+student.name+" "+student.address+" "+student.age);
        }
    }
}
