package com.basic;

abstract class First {
    First() {
        System.out.println("abstract Class constructor");
    }

    void run() {
        System.out.println("abstract class method");
    }

    abstract void show();
}

class Child extends First {

    @Override
    void show() {
        System.out.println("abstract method from child class");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        First f = new Child();
        f.show();
        f.run();
    }


}
