package com.basic;
class Charger{
	void show() {
		System.out.println("Charger");
	}
}

public class ThreadBestbyInterface extends Charger implements Runnable {

	@Override
	public void run() {
		System.out.println("child class");
		
	}
	public static void main(String[] args) {
	 ThreadBestbyInterface threadBestbyInterface = new ThreadBestbyInterface();
	 Thread thread = new Thread(threadBestbyInterface);
	 thread.start();
	 threadBestbyInterface.show();
	 System.out.println("main method");
	 
	}

}
