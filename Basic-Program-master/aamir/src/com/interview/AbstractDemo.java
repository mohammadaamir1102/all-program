package com.interview;

class City{  
protected void msg()
{
System.out.println("parent class");}  
}  
  
public class AbstractDemo extends City{
  
protected void msg(){
System.out.println("child class");
}
 public static void main(String args[]){  
	 AbstractDemo obj=new AbstractDemo();  
   obj.msg();  
   }  
}

