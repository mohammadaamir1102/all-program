package com.basic;

public class MethodChaning {
    String name;
    int age;
    public MethodChaning set(String name){
        this.name=name;
        return this;
    }
    public MethodChaning get(int age){
        this.age=age;
        return this;
    }
    void show(){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        MethodChaning m=new MethodChaning();
        m.set("Aamir khan ").get(22).show();

    }
}
