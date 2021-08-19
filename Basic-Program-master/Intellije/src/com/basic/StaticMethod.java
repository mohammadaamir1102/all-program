package com.basic;

public class StaticMethod {
    String name;
    int age;
    static String college="mumbai";
    static void change(){
        college="smbc";
    }
    StaticMethod(String name,int age){
        this.name=name;
        this.age=age;
    }
    void  show(){
        System.out.println(name+" "+age+" "+college);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s=new StaticMethod("aamir",33);
        s.show();
    }
}
