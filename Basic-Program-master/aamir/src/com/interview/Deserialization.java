package com.interview;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Serializable\\demo.text"));
			April a = (April) in.readObject();
			System.out.println(a.id + " " + a.name);
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
