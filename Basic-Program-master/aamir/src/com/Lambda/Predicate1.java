package com.Lambda;

import java.util.function.Predicate;

/*
predicate is an functional interface which accepts an argument
and return boolean*/
public class Predicate1 {
public static void main(String[] args) {
	Predicate<Integer>p=age->(age>18);
	System.out.println(p.test(19));
}
}
