package com.basic;
class A implements Runnable{

    @Override
    public void run() {
        System.out.println("class A");
    }
}
class B implements Runnable{

    @Override
    public void run() {
        System.out.println("class B");
    }
}
public class ThreadMultipleTaskByMultipleThread {
    public static void main(String[] args) {
        A a =new A();
        Thread t1=new Thread(a);
        t1.start();
        B b=new B();
        Thread t2=new Thread(b);
        t2.start();
    }



}
