package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book{
    int id;
    String name,author,publisher;
    int quantity;
     Book(int id,String name,String author,String publisher,int quantity){
         this.id=id;
         this.name=name;
         this.author=author;
         this.publisher=publisher;
         this.quantity=quantity;
     }
}
public class ListConstructor {
    public static void main(String[] args) {
        List<Book>list=new ArrayList<>();
        Book b1=new Book(1,"aamir khan","Torrence","Biology",67);
        Book b2=new Book(2,"salman khan","Albert","Chemistry",33);
        Book b3=new Book(3,"irshad khan","Newton","Physics",56);
        Collections.addAll(list,b1,b2,b3);
        list.forEach(a-> System.out.println(a.id+" , "+a.name+" , "+a.author+" , "+a.publisher+" , "+a.quantity));
    }

}
