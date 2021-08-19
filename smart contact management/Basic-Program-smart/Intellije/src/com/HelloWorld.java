package com;

interface Drawable {
     void draw();

    default void msg() {
        System.out.println("default method");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Drawable n = new Rectangle();
        n.draw();
        n.msg();
    }
}
