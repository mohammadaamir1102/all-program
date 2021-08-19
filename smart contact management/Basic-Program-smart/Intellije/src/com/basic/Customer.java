package com.basic;

import java.util.*;

class Customer implements Comparable<Customer> {
    int id;
    String name;
    int age;
    String city;

    public Customer(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public int compareTo(Customer o) {
      return  this.name.compareTo(o.name);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
