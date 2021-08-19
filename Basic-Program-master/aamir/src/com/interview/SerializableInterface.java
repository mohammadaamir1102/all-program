package com.interview;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class April implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int id;
	String name;

	April(int id,String name) {
		this.id = id;
		this.name = name;
	}
}

public class SerializableInterface {

	public static void main(String[] args) throws IOException {
		April s=new April(101,"aamir khan");
		try {
			FileOutputStream fo=new FileOutputStream("D:\\Serializable\\demo.text");
			ObjectOutputStream o=new ObjectOutputStream(fo);
			o.writeObject(s);
			o.flush();
			o.close();
			System.out.println("succes");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
