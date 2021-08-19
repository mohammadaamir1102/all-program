package com.interview;

public class ObjectClassMethodGetClass implements Runnable {

	public static void main(String[] args) {

		ObjectClassMethodGetClass o = new ObjectClassMethodGetClass();
		Thread th = new Thread(o);
		th.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("aamir khan");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
