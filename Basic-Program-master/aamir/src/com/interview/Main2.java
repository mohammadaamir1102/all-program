package com.interview;

public class Main2 implements Runnable{
	String str1,str2;
	public void run() {
		for (int i = 0; i < 10; i++) {
			str1="welcome";
			str2="to java";
			System.out.println(str1+" "+str2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 run=new Main2();
		Thread ob1=new Thread(run);
		Thread ob2=new Thread();
		ob1.start();
		ob2.run();

	}

}
