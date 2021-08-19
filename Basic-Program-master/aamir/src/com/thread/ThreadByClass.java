package com.thread;

public class ThreadByClass extends Thread{
	public void run() {
		System.out.println("aamir khan");
		
	}
	

	public static void main(String[] args) {
		ThreadByClass t=new ThreadByClass();
		t.start();
		//if again we use here t.start then exception throw (illegelthreadexceptioin)
		
	}

}
