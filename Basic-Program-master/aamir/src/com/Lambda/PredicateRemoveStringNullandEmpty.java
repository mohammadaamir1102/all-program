package com.Lambda;

import java.util.function.Predicate;

public class PredicateRemoveStringNullandEmpty {
	public static void main(String[] args) {
		String[]a= {"Aamir khan",null,"","Salman",null,""};
		Predicate<String>empty=x->x==null;
		Predicate<String>null1=y->y.isEmpty();
		for (String string : a) {
			if(empty.or(null1).test(string));
			System.out.println(string);
		}
		
	}

}
