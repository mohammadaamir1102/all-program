package com.basic;

public class ParameterizeConstructor {
    int age;
    String name;
    String address;

    ParameterizeConstructor(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    void executeConstructor() {
        System.out.println(age + " " + name + " " + address);
    }

    public static void main(String[] args) {
        ParameterizeConstructor p = new ParameterizeConstructor(12, "Aamir khan", "Millat");
        p.executeConstructor();
    }

}
