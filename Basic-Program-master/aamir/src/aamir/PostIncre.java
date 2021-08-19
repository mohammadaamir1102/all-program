package aamir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostIncre {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		System.out.println("enter the number");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum +=2;
			}
			else {
				sum+=1;
			}
		}
		System.out.println("total apple "+sum);
	}
}