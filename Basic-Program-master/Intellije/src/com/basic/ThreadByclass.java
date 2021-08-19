package com.basic;

public class ThreadByclass extends Thread {
    public void run(){
        System.out.println("aamir khan");
    }
    public static void main(String[] args) {
        ThreadByclass t=new ThreadByclass();
        t.start();
    }

    }

