package com.comparable;

public class Student implements Comparable<Student> {
    private int id;
    private int mark;

    public Student(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.id>o.id) return 1;
        else if (this.id <o.id) return -1;
        return 0;
    }
}
