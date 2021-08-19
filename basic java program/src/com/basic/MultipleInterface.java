package com.basic;


interface Abc {
    void run();
}

interface Xyz {
    void run();
}

public class MultipleInterface implements Abc,Xyz {
    public static void main(String[] args) {
        Abc a=new MultipleInterface();
        a.run();
    }

    @Override
    public void run() {
        System.out.println("hello Aamir khan");
    }
}
