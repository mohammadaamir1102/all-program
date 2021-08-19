package com.basic;

public class ConstructorChanning {
    ConstructorChanning(){
        System.out.println("default constructor");
    }
    ConstructorChanning(int a){
        this();
        System.out.println(a+" and parameterize constructor");

    }

    public static void main(String[] args) {
        ConstructorChanning c=new ConstructorChanning(10);
    }
}
