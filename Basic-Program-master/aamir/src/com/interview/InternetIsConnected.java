package com.interview;

import java.net.URL;
import java.net.URLConnection;

public class InternetIsConnected {
	public static void main(String[] args) {
		try {
			URL url=new URL("https://www.google.com");
			URLConnection openConnection = url.openConnection();
			openConnection.connect();
			System.out.println("Net is Connected");
		} catch (Exception e) {
			System.out.println("Net is not Connected");
		}
	}

}
