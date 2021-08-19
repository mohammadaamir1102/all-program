package com;

public class ConstructorsOverLoad {
    int id;
    String name;
    String address;

    ConstructorsOverLoad(int i, String n, String ad) {
        id = i;
        name = n;
        address = ad;
    }

    void run() {
        System.out.println(id + " " + name + " " + address);
    }

    public static void main(String[] args) {
        ConstructorsOverLoad c = new ConstructorsOverLoad(12, "aamir khan", "basti");
        c.run();
    }
}
