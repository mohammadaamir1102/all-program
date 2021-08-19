package aamir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumNumberInArrayByUser {
    public static void main(String[] args) throws IOException {
        int max;
        System.out.println("Enter the size");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] a = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        max = a[0];
        for (int i = 0; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println(max + " is a maximum value");


    }
}
