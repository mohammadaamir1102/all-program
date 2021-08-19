package com.thread;

 class Threa implements Runnable {
	public void run() {
		System.out.println("aamir khna");
	}
}

 class Thre implements Runnable {
	public void run() {
		System.out.println("aasim khan");
	}

}
public class Thread2{
	public static void main(String[] args) {
		Threa t1=new Threa();
		Thread th1=new Thread(t1);
		Thre t2=new Thre();
		Thread th2=new Thread(t2);
		th1.start();
		th2.start();
	

	}

}
