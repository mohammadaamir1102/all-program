package aamir;

import java.util.HashSet;

public class HashSetGetElement {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Aamir khan");
        set.add("Arbaz khan");
        set.add("Suhail khan");

        for (String s : set) {
            if (s.contains("Aamir khan")) {
                set.forEach(System.out::println);
            }
        }
    }
}
