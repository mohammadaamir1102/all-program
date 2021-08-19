package com.thread;

public class PracticeThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("abcd");
			} else {
				System.out.println("xyzz");
			}
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		PracticeThread practiceThread = new PracticeThread();
		Thread thread = new Thread(practiceThread);
		thread.start();
	}

}
