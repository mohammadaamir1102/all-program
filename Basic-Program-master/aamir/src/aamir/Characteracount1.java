package aamir;

import java.util.HashSet;

public class Characteracount1 {
    public static void main(String[] args) {
        String string="Aggregation";
        char []a=string.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i <string.length(); i++) {
            if(set.contains(a[i])){
                continue;
            }
            int count=1;
            for (int j = i+1; j <string.length() ; j++) {
                if (a[i]==a[j]){
                count++;
                }
            }
            System.out.println(a[i]+" is repeted "+(count)+" times");
            set.add(a[i]);
        }
    }
}
