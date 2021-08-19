package com;
class Coca{
    Object show(){
        System.out.println("Parent class");
        return null;
    }
}
class Cola extends Coca{
    String show(){
        System.out.println("child class");
        return null;
    }
}
public class CovariantReturnType {
    public static void main(String[] args) {
        Coca c=new Cola();
        c.show();
    }
}
