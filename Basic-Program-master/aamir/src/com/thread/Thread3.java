package com.thread;

class ThreadPool extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello Aamir");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Thread3 {
	public static void main(String[] args) {
		Thread.currentThread().setName("aamir ");// here thread name change
		System.out.println(Thread.currentThread().getName());// here thread name get
		ThreadPool threadPool = new ThreadPool();
		threadPool.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello Aamir");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
