package com.basic;

class Bottle {
   protected Object run() {
        System.out.println("Parent");
        return null;
    }
}

class Glass extends Bottle {
    public Number run() {
        System.out.println("child");
        return null;
    }
}

public class RevisionPractice {
    public static void main(String[] args) {
        Bottle g = new Glass();
        g.run();
    }
}
