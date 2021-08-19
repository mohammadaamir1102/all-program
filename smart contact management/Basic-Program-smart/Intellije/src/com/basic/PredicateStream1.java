package com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Predicate1 {
    private int id;
    private String name;
    private float salary;

    public Predicate1(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "predicate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class PredicateStream1 {
    public static void main(String[] args) {
        List<Predicate1> list = Arrays.asList(new Predicate1(12, "salman khan", 3454),
                new Predicate1(13, "arbaj khan", 343434),
                new Predicate1(34, "furqan khan", 324324));
        Predicate<Predicate1> p = a -> a.getSalary() > 10000;
        for (Predicate1 pre : list) {
            if (p.test(pre))
                System.out.println(pre.getId() + " " + pre.getName() + " " + pre.getSalary());
        }
    }
}
