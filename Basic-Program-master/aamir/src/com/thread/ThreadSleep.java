package com.thread;

public class ThreadSleep implements Runnable {
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Aamir khan");
			}
			if(i%2!=0) {
				System.out.println("Ehtesham Aalam");
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		ThreadSleep s=new ThreadSleep();
		Thread th=new Thread(s);
		th.start();

	}

}
