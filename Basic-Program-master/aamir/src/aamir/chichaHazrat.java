package aamir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class chichaHazrat {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String urName=br.readLine();
		System.out.println("Type your choice");
		String name=br.readLine();
		switch (name){
			case "a.w":
				System.out.println("w.a "+urName);
				break;
			case "kaise ho aap":
				System.out.println("Alhamdulillah "+urName);
				break;
			case "allah hafiz":
				System.out.println("allah hafiz "+urName);
				break;
			default:
				System.out.println("Sorry "+urName+" your input miss matched");
		}

	}

	}


