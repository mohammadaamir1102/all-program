package com.interview;

public class StringDemo {
	

	public static void main(String[] args) {
    String s1="EHTESHAM";
    char []	ch=s1.toCharArray();
    int name=ch.length;
    
    System.out.println("Length      "+name);
    
    for(int i=0;i<name;i++) {
	System.out.println(ch[i]);
}
}
}
