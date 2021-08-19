package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WrapperClass {

    public static void main(String[] args) {
/*
        List<String> strings = List.of("aamir khan", "Salman khan");
        strings.add("furqan khan");
        strings.forEach(a-> System.out.println(a));
*/

       /* ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Aamir khan ",
                "Salman khan", "Mubasshir khan", "Gulzar khan",
                "firoz khan");
        strings.stream().filter(a -> a.startsWith("M")).forEach(System.out::println);*/

     /*   String a[]={"Aamir khan","Salman khan","Mubasshir khan"};
       *//* List<String> strings = Arrays.asList(a);
        Collections.sort(strings);
        strings.forEach(q-> System.out.println(q));*//*
        Stream<String> a1 = Stream.of(a);
        a1.forEach(System.out::println);

*/

        List<Integer> objects =Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> even = objects.stream().map(a -> a * 2).filter(num -> num % 2 == 0).collect(Collectors.toList());
        even.forEach(z-> System.out.println(z));


    }
}
