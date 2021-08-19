package com.basic;
import java.util.Scanner;
public class MarkSheetPercentageCalculator {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
            System.out.println("enter number of Chemistry");
            int chemistry = s.nextInt();
            if (chemistry > 100) {
                System.out.println("no out of limit");
                return;
            }
            System.out.println("enter number of physics");
            int physics = s.nextInt();
            if (physics > 100) {
                System.out.println("no out of limit");
                return;
            }
            System.out.println("enter number of math");
            int math = s.nextInt();
            if (math > 100) {
                System.out.println("no out of limit");
                return;
            }
            System.out.println("enter number of hindi");
            int hindi = s.nextInt();
            if (hindi > 100) {
                System.out.println("no out of limit");
                return;
            }
            System.out.println("enter number of english");
            int english = s.nextInt();
            if (english > 100) {
                System.out.println("no out of limit");
                return;
            }
            float percentage = ((chemistry + physics + math + hindi + english) / 500.0f) * 100;
            System.out.println("Total percentage is : " + percentage);
        }
}
