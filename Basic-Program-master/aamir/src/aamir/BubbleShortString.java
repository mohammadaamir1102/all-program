package aamir;

public class BubbleShortString {
    public static void main(String[] args) {
        String[] a = {"zeeshan", "salman", "gufran", "khursheed"};
        String temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(String q:a){
            System.out.println(q);
        }
    }
}
