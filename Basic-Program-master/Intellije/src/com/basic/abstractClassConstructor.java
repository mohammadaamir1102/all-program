package com.basic;
abstract  class Abc{
    Abc(int a){
        System.out.println("abstract class");
    }
}
class Bcd extends Abc{
    Bcd(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	void run(){
        System.out.println("child class");
    }
}
public class abstractClassConstructor {
    public static void main(String[] args) {
        Bcd b=new Bcd(10);
        b.run();
    }
}
