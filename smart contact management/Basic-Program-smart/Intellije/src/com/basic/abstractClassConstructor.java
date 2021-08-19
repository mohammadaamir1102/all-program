package com.basic;
abstract  class Abc{
    Abc(){
        System.out.println("abstract class");
    }
}
class Bcd extends Abc{
    void run(){
        System.out.println("child class");
    }
}
public class abstractClassConstructor {
    public static void main(String[] args) {
        Bcd b=new Bcd();
        b.run();
    }
}
