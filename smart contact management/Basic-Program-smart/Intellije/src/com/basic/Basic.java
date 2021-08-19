package com.basic;

public class Basic {
    void msg()throws Exception{System.out.println("parent");}
}

class TestExceptionChild4 extends Basic{
    void msg()throws ArithmeticException{System.out.println("child");}

    public static void main(String args[]){
        Basic p=new TestExceptionChild4();
        try {
            p.msg();
        }catch (Exception d){}; 
    }
}

