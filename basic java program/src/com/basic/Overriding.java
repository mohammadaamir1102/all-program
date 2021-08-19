package com.basic;

class A{
    void run(){
        System.out.println("Parent Class");
    }
}
class B extends A{
    void run(){
        System.out.println("Child class");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.run();
    }

}
