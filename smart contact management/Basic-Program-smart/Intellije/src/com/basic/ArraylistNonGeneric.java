package com.basic;

import java.util.ArrayList;

public class ArraylistNonGeneric {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("aamir khan");
        list.add(43243);
        list.add(4343.35);
        list.add(342543599);
        for (Object li:list)
            System.out.println(li);

    }
}
