package com.thread;


////// single task from multiple thread

public class Thread1 implements Runnable{
	public void run() {
		System.out.println("aamir khan");
	}

	public static void main(String[] args) {
	Thread1 t=new Thread1();
	Thread th=new Thread(t);
	Thread1 t1=new Thread1();
	Thread th1=new Thread(t1);
	th.start();
	th1.start();

	}

}
