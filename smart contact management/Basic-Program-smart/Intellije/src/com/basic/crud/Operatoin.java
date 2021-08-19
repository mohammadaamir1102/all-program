package com.basic.crud;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Operatoin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Student> list = new CopyOnWriteArrayList<>();
        System.out.println("How many Student do you want to add");

        int size = s.nextInt();

        for (int i = 0; i < size; i++) {

            System.out.println("Enter " + (i + 1) + " st Student Id");
            int id = s.nextInt();


            System.out.println("Enter " + (i + 1) + " st Student Name");
            String name = s.nextLine();


            Student sc = new Student();
            sc.setId(id);
            sc.setStudentName(name);
            list.add(sc);

        }
        String text;
        do {
            System.out.println("Press 1 for Finding By Id");
            System.out.println("Press 2 for Update");
            System.out.println("Press 3 for Show All Data");
            System.out.println("Press 4 for Delete");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Id for Show Record ");
                    int next = s.nextInt();
                    for (Student student : list) {
                        if (student.getId() == next) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter Id for update");
                    int next1 = s.nextInt();
                    for (Student student : list) {
                        if (student.getId() == next1) {
                            System.out.println("Enter New Name");
                            String newName = s.next();



                        }
                    }
                    break;
                case 3:
                    for (Student student : list) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    System.out.println("Enter Id for delete Record");
                    int next3 = s.nextInt();
                    for (Student student : list) {
                        if (student.getId() == next3) {
                            list.remove(next3);
                        }
                    }
                    break;

                default:
                    System.out.println("wrong entry");
            }

            System.out.println("Do you want to continue y/no");
            text = s.next();

        } while (text.equalsIgnoreCase("y"));
        System.out.println("Thanks for visiting");
        s.close();
    }
}
