package com.basic;

class Aamir {
    int id;
    String name, address, street;
    int age;

    public Aamir(int id, String name, String address, String street, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.street = street;
        this.age = age;

        int a=10;
        int b=a;
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Aamir> set = new LinkedHashSet<>();
        Aamir a1 = new Aamir(12, "aamir khan", "basti", "millat nager", 33);
        Aamir a2 = new Aamir(13, "aasim khan", "basti", "millat nager", 20);
        Aamir a3 = new Aamir(14, "aaquib khan", "basti", "millat nager", 13);


    }

}
