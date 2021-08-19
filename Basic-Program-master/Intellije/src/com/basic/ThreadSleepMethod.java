package com.basic;


public class ThreadSleepMethod implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println("Aamir khan");
            }
            if (i % 2 != 0) {
                System.out.println("Asadullah");
            }
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        ThreadSleepMethod t=new ThreadSleepMethod();
        Thread th=new Thread(t);
        th.start();
    }
}

