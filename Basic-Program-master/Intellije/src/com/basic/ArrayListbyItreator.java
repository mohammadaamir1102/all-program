package com.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class    ArrayListbyItreator {
    public static void main(String[] args) {
        List list=new ArrayList<String>();
        list.add("aamir khan");
        list.add("aasim khan");
        list.add("aaquib khan");
        Iterator itr= list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
