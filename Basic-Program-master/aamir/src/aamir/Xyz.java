package aamir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Xyz {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the float number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float f = Float.parseFloat(br.readLine());
		String age = "12345";
		Integer ageInteger = Integer.valueOf(age);
		System.out.println(f);
	}

}
