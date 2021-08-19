package com.thread;

public class ThreadByInterface implements Runnable {
	public void run()
	{
		System.out.println("aamir khan");
	}

	public static void main(String[] args) {
		ThreadByInterface t=new ThreadByInterface();
		Thread th=new Thread(t);
		th.start();
		

	}

	
}
