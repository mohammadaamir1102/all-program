package com.thread;

class Test implements Runnable {

	@Override
	public void run() {
		System.out.println("Test class");

	}

}
class Run implements Runnable{

	@Override
	public void run() {
		System.out.println("Run class");
		
	}
	
}
public class ThreadMultipleTaskbyMultipleThread {
	public static void main(String[] args) {
	Test t=new Test();
	Thread thread = new Thread(t);
	thread.start();
	
	Run run = new Run();
	Thread thread2 = new Thread(run);
	thread2.start();
	
	}

}
