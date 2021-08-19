package com.practice;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class InternateConnect {
	public static void main(String[] args) throws IOException {
		try {
			URL url = new URL("https://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			System.out.println("Net connected");
		
		} catch (Exception e) {
			System.out.println("not connected");
		}
	}

}
